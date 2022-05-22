package com.example.SuperMarket.Models;

import javax.persistence.*;

@Entity
public class ProductCustomer {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Product product;

    @ManyToOne
    @JoinColumn
    private Customer customer;


    public ProductCustomer() {
    }

    public ProductCustomer(Product product, Customer customer) {
        this.product = product;
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
