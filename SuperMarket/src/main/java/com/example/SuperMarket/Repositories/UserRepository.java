package com.example.SuperMarket.Repositories;

import com.example.SuperMarket.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
