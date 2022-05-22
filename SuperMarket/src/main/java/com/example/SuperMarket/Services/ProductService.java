package com.example.SuperMarket.Services;


import com.example.SuperMarket.Models.*;
import com.example.SuperMarket.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import javax.validation.Valid;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductCustomerService productCustomerService;

    public void create(@RequestBody @Valid Product product) {
        productRepository.save(product);
    }

    public List<Product> getProducts(Brands brand, Category category, boolean sale) {
        if (brand == null && category != null) {
            if (sale){
                return productRepository.getProductByCategoryAndSale(category, sale);
            } else {
                return productRepository.getProductByCategory(category);
            }
        } else if (category == null && brand != null){
            if (sale){
                return productRepository.getProductByBrandsAndSale(brand, sale);
            } else {
                return productRepository.getProductByBrands(brand);
            }
        } else if (category == null && brand == null) {
            if (sale) return productRepository.getProductBySale(sale);
            else return productRepository.findAll();
        }
        if (sale) {
            return productRepository.getProductByBrandsAndCategoryAndSale(brand, category, sale);
        } else {
            return productRepository.getProductByBrandsAndCategory(brand, category);
        }
    }


    public List<ProductCustomer> soldProducts() {
        return productCustomerService.getAll();
    }
}