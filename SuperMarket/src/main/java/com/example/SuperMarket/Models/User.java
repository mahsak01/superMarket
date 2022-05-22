package com.example.SuperMarket.Models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="User")
public class User {
    @Id
    @SequenceGenerator(
            name = "name_sequence",
            sequenceName = "name_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "name_sequence"
    )
    private Long id;

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

    @NotEmpty(message = "Please fill password")
    @Size(min = 8, max = 255, message = "Please Enter password between 8-255 character")
    private String password;

    private Authorities authority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Authorities getAuthority() {
        return authority;
    }

    public void setAuthority(Authorities authority) {
        this.authority = authority;
    }
}
