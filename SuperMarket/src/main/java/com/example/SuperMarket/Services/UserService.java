package com.example.SuperMarket.Services;

import com.example.SuperMarket.Models.Authorities;
import com.example.SuperMarket.Models.User;
import com.example.SuperMarket.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    public User addNewUser(User user) throws Exception {

        if (searchByUsername(user.getUsername()) != null)
            throw new Exception("The user With This username Exist");

        user.setAuthority(Authorities.CUSTOMER);
        return userRepository.save(user);
    }

    public User updateUser(User user, Long id) throws Exception {

        if (getUserWithId(id) == null)
            throw new Exception("The user With This id not Exist");
        if (searchByUsername(user.getUsername()) != null)
            if (!searchByUsername(user.getUsername()).getId().equals(id))
                throw new Exception("The user With This username Exist");

        user.setId(id);
        return userRepository.save(user);
    }

    public User searchUser(String username, String password) throws Exception {
        User user = searchByUsername(username);
        if (user == null)
            throw new Exception("The user With This username not Exist");
        if (!user.getPassword().equals(password))
            throw new Exception("The input password is incorrect");
        return user;
    }

    public User searchByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User getUserWithId(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty())
            return null;
        return user.get();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) throw new UsernameNotFoundException("User not found");
        else {
            List<Authorities> authorities = new ArrayList<>();
            authorities.add(user.getAuthority());
            return new org.springframework.security.core.userdetails
                    .User(user.getUsername(), user.getPassword(), authorities);
        }
    }
}
