package com.example.SuperMarket.Services;

import com.example.SuperMarket.Models.Brands;
import com.example.SuperMarket.Repositories.BrandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Service
public class BrandsService {

    @Autowired
    private BrandsRepository brandsRepository;

    public void create(@RequestBody @Valid Brands brands) throws Exception {
        if (getBrandByName(brands.getBrandName()) == null) {
            brandsRepository.save(brands);
        } else throw new Exception("brand already exists");
    }

    public Brands getBrandByName(String name) {
        return brandsRepository.getBrandsByBrandName(name);
    }

    public Brands getBrandById(long id) {
        return brandsRepository.findById(id).isPresent() ? brandsRepository.findById(id).get() : null;
    }
}
