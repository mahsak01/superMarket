package com.example.SuperMarket.Services;


import com.example.SuperMarket.Models.Customer;
import com.example.SuperMarket.Models.User;
import com.example.SuperMarket.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public void add(Customer customer, User user) {
        customer.setUser(user);
        customerRepository.save(customer);
    }

    public Customer findByUser(User user) throws Exception {
        Optional<Customer> customer = customerRepository.findCustomerByUser(user);

        if (customer.isPresent()) return customer.get();
        else throw new Exception("customer not found");
    }
}
