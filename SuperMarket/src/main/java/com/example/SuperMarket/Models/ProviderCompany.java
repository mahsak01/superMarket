package com.example.SuperMarket.Models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="ProviderCompany")
public class ProviderCompany {

    @Id
    @SequenceGenerator(
            name = "providerCompany_sequence",
            sequenceName = "providerCompany_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "providerCompany_sequence"
    )
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private User user;


    @NotEmpty(message = "Please fill companyName")
    @Size(min = 3, max = 255, message = "Please Enter companyName  between 1-255 character")
    private String companyName;


    @NotEmpty(message = "Please fill warehouseAddress")
    @Size(min = 3, max = 255, message = "Please Enter warehouseAddress  between 1-255 character")
    private String warehouseAddress;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getName() {
        return user;
    }

    public void setName(User user) {
        this.user = user;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }
}
