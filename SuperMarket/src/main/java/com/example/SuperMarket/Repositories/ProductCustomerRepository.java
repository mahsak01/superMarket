package com.example.SuperMarket.Repositories;

import com.example.SuperMarket.Models.Customer;
import com.example.SuperMarket.Models.ProductCustomer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCustomerRepository extends CrudRepository<ProductCustomer, Long> {
    List<ProductCustomer> getProductCustomerByCustomer(Customer customer);
}
