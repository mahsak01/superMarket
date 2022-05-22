package com.example.SuperMarket.Models;

import org.springframework.security.core.GrantedAuthority;

public enum Authorities implements GrantedAuthority {
    CUSTOMER("ROLE_CUSTOMER"),
    PROVIDER("ROLE_PROVIDER"),
    SALEMAN("ROLE_SALEMAN");

    Authorities(String name) {
        this.name = name;
    }

    String name;

    @Override
    public String getAuthority() {
        return this.name;
    }
}
