package com.example.SuperMarket.Models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="Provider")
public class Provider {


    @Id
    @SequenceGenerator(
            name = "provider_sequence",
            sequenceName = "provider_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "provider_sequence"
    )
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private User user;

    @NotEmpty(message = "Please fill product Id")
    private Long productId;

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

    public Long getPrudectId() {
        return productId;
    }

    public void setPrudectId(Long productId) {
        this.productId = productId;
    }
}
