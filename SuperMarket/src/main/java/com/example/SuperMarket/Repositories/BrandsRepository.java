package com.example.SuperMarket.Repositories;

import com.example.SuperMarket.Models.Brands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandsRepository extends JpaRepository<Brands, Long> {
    public Brands getBrandsByBrandName(String name);
}
