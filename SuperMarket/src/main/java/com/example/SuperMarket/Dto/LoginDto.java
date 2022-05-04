package com.example.SuperMarket.Dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginDto {

    @NotEmpty(message = "Please fill username")
    @Size(min = 3, max = 255, message = "Please Enter username  between 3-255 character")
    private String username;

    @NotEmpty(message = "Please fill password")
    @Size(min = 8, max = 255, message = "Please Enter password between 8-255 character")
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
