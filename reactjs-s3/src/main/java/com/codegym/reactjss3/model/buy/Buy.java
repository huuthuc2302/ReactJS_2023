package com.codegym.reactjss3.model.buy;

import com.codegym.reactjss3.model.lego.Lego;
import com.codegym.reactjss3.model.user.User;

import javax.persistence.*;

@Entity
public class Buy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Lego lego;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

}
