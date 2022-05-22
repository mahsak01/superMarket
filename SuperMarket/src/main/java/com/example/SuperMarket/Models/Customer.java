package com.example.SuperMarket.Models;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="Customer")
public class Customer {

    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
   private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private User user;

    @Size(min = 3, max = 255, message = "Please Enter zipCode  between 3-255 character")
    private String zipCode;

    @Size(min = 3, max = 255, message = "Please Enter address  between 3-255 character")
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
