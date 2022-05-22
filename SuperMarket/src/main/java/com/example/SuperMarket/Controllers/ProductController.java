package com.example.SuperMarket.Controllers;


import com.example.SuperMarket.Models.Product;
import com.example.SuperMarket.Models.ProductCustomer;
import com.example.SuperMarket.Models.extras.Response;
import com.example.SuperMarket.Services.BrandsService;
import com.example.SuperMarket.Services.CategoryService;
import com.example.SuperMarket.Services.ProductCustomerService;
import com.example.SuperMarket.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/products")
public class ProductController {

    ProductService productService;
    BrandsService brandsService;
    CategoryService categoryService;
    ProductCustomerService productCustomerService;

    @Autowired
    public ProductController(ProductService productService, BrandsService brandsService, CategoryService categoryService, ProductCustomerService productCustomerService) {
        this.productService = productService;
        this.brandsService = brandsService;
        this.categoryService = categoryService;
        this.productCustomerService = productCustomerService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<Product> getProducts(@PathParam(value = "brand") Optional<Long> brand,
                                     @PathParam(value = "category") Optional<Long> category,
                                     @PathParam(value = "sale") Optional<Boolean> sale) {
        return productService.getProducts(brand.isPresent() ? brandsService.getBrandById(brand.get()) : null,
                category.isPresent() ? categoryService.getCategoryById(category.get()) : null,
                sale.isPresent() ? sale.get() : false);
    }


    @RequestMapping(method = RequestMethod.GET, path = "sold")
    public ResponseEntity<Object> getSold(Authentication authentication) {
        return ResponseEntity.ok(new Response(Response.Status.SUCCESS, productCustomerService.getAll()));
    }
}
