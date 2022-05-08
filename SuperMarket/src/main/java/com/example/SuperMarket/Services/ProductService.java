package com.example.SuperMarket.Services;


import com.example.SuperMarket.Models.Brands;
import com.example.SuperMarket.Models.Category;
import com.example.SuperMarket.Models.Product;
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

    public void create(@RequestBody @Valid Product product) {
        productRepository.save(product);
    }

    public List<Product> getProducts(Brands brand, Category category) {
        if (brand == null && category != null) {
            return productRepository.getProductByCategory(category);
        } else if (category == null && brand != null){
            return productRepository.getProductByBrands(brand);
        } else if (category == null && brand == null) {
            return productRepository.findAll();
        }
        return productRepository.getProductByBrandsAndCategory(brand, category);
    }
}
