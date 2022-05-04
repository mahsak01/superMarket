package com.example.SuperMarket.Models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity

@Table(name="Brands")
public class Brands {
    @Id
    @SequenceGenerator(
            name = "brands_sequence",
            sequenceName = "brands_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "brands_sequence"
    )
    private Long id;

    @NotEmpty(message = "Please fill brandName")
    @Size(min = 1, max = 255, message = "Please Enter brandName  between 3-255 character")
    private String brandName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
