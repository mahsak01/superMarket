package com.example.SuperMarket.Services;

import com.example.SuperMarket.Models.Category;
import com.example.SuperMarket.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    public void create(@RequestBody @Valid Category category) throws Exception {
        if (getCategoryByName(category.getCategoryName()) == null) {
            categoryRepository.save(category);
        } else throw new Exception("category already exists");
    }

    public Category getCategoryByName(String name) {
        return categoryRepository.getCategoryByCategoryName(name);
    }

    public Category getCategoryById(long id) {
        return categoryRepository.findById(id).isPresent() ? categoryRepository.findById(id).get() : null;
    }
}
