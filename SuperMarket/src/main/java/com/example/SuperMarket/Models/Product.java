package com.example.SuperMarket.Models;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    private Long id;

    @NotEmpty(message = "Please fill name")
    @Size(min = 3, max = 255, message = "Please Enter name  between 1-255 character")
    private String name;

    @NotEmpty(message = "Please fill proData")
    private Date proData;

    @NotEmpty(message = "Please fill exprData")
    private Date exprData;

    @NotEmpty(message = "Please fill price")
    @Size(min = 3, max = 255, message = "Please Enter price  between 1-255 character")
    private String price;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private List<Customer> customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Saleman saleman;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Brands brands;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Category category;

    @NotEmpty(message = "Please fill discount")
    @Min(value = 0, message = "discount min is 0%")
    @Max(value = 100, message = "discount max is 100%")
    private float discount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getProData() {
        return proData;
    }

    public void setProData(Date proData) {
        this.proData = proData;
    }

    public Date getExprData() {
        return exprData;
    }

    public void setExprData(Date exprData) {
        this.exprData = exprData;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Saleman getSaleman() {
        return saleman;
    }

    public void setSaleman(Saleman saleman) {
        this.saleman = saleman;
    }

    public Brands getBrands() {
        return brands;
    }

    public void setBrands(Brands brands) {
        this.brands = brands;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
