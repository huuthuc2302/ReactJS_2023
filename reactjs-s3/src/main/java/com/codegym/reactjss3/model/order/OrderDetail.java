package com.codegym.reactjss3.model.order;

import com.codegym.reactjss3.model.bill.Bill;
import com.codegym.reactjss3.model.lego.Lego;

import javax.persistence.*;

public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String datePayment;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Lego lego;

    @ManyToOne
    @JoinColumn(name = "bill_id", referencedColumnName = "id")
    private Bill bill;

    public OrderDetail() {
    }

    public OrderDetail(Integer id, String datePayment, Integer quantity, Lego lego, Bill bill) {
        this.id = id;
        this.datePayment = datePayment;
        this.quantity = quantity;
        this.lego = lego;
        this.bill = bill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(String datePayment) {
        this.datePayment = datePayment;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Lego getLego() {
        return lego;
    }

    public void setLego(Lego lego) {
        this.lego = lego;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

}
