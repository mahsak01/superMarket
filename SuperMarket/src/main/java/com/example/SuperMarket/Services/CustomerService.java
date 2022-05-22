package com.example.SuperMarket.Services;


import com.example.SuperMarket.Models.Customer;
import com.example.SuperMarket.Models.Product;
import com.example.SuperMarket.Models.ProductCustomer;
import com.example.SuperMarket.Models.User;
import com.example.SuperMarket.Repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final ProductCustomerService productCustomerService;

    public CustomerService(CustomerRepository customerRepository, ProductCustomerService productCustomerService) {
        this.customerRepository = customerRepository;
        this.productCustomerService = productCustomerService;
    }

    public void add(Customer customer, User user) {
        customer.setUser(user);
        customerRepository.save(customer);
    }

    public Customer findByUser(User user) throws Exception {
        Optional<Customer> customer = customerRepository.findCustomerByUser(user);

        if (customer.isPresent()) return customer.get();
        else throw new Exception("customer not found");
    }


    public List<ProductCustomer> getMyProducts(User user) throws Exception {
        Customer customer = this.findByUser(user);

        return productCustomerService.usersProducts(customer);
    }


    public void addProductToCard(Product product, User user) throws Exception {
        Customer customer = this.findByUser(user);

        productCustomerService.addRecord(product, customer);
    }
}
