package com.example.SuperMarket.Repositories;

import java.util.List;
import com.example.SuperMarket.Models.Brands;
import com.example.SuperMarket.Models.Category;
import com.example.SuperMarket.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getProductByBrandsAndCategory(Brands brands, Category category);
    List<Product> getProductByBrands(Brands brands);
    List<Product> getProductByCategory(Category category);

}
