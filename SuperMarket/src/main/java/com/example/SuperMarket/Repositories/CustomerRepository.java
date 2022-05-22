package com.example.SuperMarket.Repositories;

import com.example.SuperMarket.Models.Customer;
import com.example.SuperMarket.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Optional<Customer> findCustomerByUser(User user);
}
