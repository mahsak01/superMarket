package com.example.SuperMarket.Models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="Provide")
public class Provide {


    @Id
    @SequenceGenerator(
            name = "provide_sequence",
            sequenceName = "provide_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "provide_sequence"
    )
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private User user;

    @NotEmpty(message = "Please fill prudectId")
    private Long prudectId;

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
        return prudectId;
    }

    public void setPrudectId(Long prudectId) {
        this.prudectId = prudectId;
    }
}
