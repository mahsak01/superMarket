package com.example.SuperMarket.Repositories;

import com.example.SuperMarket.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    public Category getCategoryByCategoryName(String name);
}
