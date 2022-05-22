package com.example.SuperMarket.Repositories;

import java.util.List;
import com.example.SuperMarket.Models.Brands;
import com.example.SuperMarket.Models.Category;
import com.example.SuperMarket.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getProductByBrandsAndCategoryAndSale(Brands brands, Category category, boolean sale);
    List<Product> getProductByBrandsAndCategory(Brands brands, Category category);

    List<Product> getProductByBrandsAndSale(Brands brands, boolean sale);
    List<Product> getProductByBrands(Brands brands);

    List<Product> getProductByCategoryAndSale(Category category, boolean sale);
    List<Product> getProductByCategory(Category category);

    List<Product> getProductBySale(boolean sale);
}
