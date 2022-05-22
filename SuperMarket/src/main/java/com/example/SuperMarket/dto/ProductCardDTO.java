package com.example.SuperMarket.dto;

import org.springframework.stereotype.Component;

@Component
public class ProductCardDTO {
    Long productId;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
