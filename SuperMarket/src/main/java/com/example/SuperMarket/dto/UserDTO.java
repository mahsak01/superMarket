package com.example.SuperMarket.dto;

import com.example.SuperMarket.Models.Customer;
import com.example.SuperMarket.Models.User;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Component
public class UserDTO {
    @NotEmpty(message = "Please fill username")
    @Size(min = 3, max = 255, message = "Please Enter username  between 3-255 character")
    private String username;

    @NotEmpty(message = "Please fill firstname")
    @Size(min = 3, max = 255, message = "Please Enter firstname  between 3-255 character")
    private String firstname;

    @NotEmpty(message = "Please fill lastname")
    @Size(min = 3, max = 255, message = "Please Enter lastname between 3-255 character")
    private String lastname;

    @NotEmpty(message = "Please fill email")
    private String email;

    @NotEmpty(message = "Please fill phone")
    private String phone;

    @Size(min = 3, max = 255, message = "Please Enter zipCode  between 3-255 character")
    private String zipCode;

    @Size(min = 3, max = 255, message = "Please Enter address  between 3-255 character")
    private String address;

    public UserDTO() {
    }

    public  UserDTO(User user, Customer customer) {

        this.address = customer.getAddress();
        this.zipCode = customer.getZipCode();

        this.email = user.getEmail();
        this.firstname = user.getFirstname();
        this.lastname = user.getLastname();
        this.phone = user.getPhone();
        this.username = user.getUsername();
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
