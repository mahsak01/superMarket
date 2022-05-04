package com.example.SuperMarket.Models;

import javax.persistence.*;

@Entity
@Table(name="Saleman")
public class Saleman {

    @Id
    @SequenceGenerator(
            name = "saleman_sequence",
            sequenceName = "saleman_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "saleman_sequence"
    )
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private User user;



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


}
