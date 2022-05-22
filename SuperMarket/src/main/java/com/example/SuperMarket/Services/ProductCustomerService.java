package com.example.SuperMarket.Services;

import com.example.SuperMarket.Models.Customer;
import com.example.SuperMarket.Models.Product;
import com.example.SuperMarket.Models.ProductCustomer;
import com.example.SuperMarket.Repositories.ProductCustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCustomerService {
    final ProductCustomerRepository repository;

    public ProductCustomerService(ProductCustomerRepository repository) {
        this.repository = repository;
    }


    public List<ProductCustomer> getAll() {
        return (List<ProductCustomer>) repository.findAll();
    }


    public List<ProductCustomer> usersProducts(Customer customer) {
        return repository.getProductCustomerByCustomer(customer);
    }

    public void addRecord(Product product, Customer customer) {
        ProductCustomer record = new ProductCustomer(product, customer);

        repository.save(record);
    }
}
