package com.codegym.reactjss3.model.bill;

import javax.persistence.*;

public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String createDate;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "bill_type_id", referencedColumnName = "id")
    private BillType billType;

    public Bill() {
    }

    public Bill(Integer id, String createDate, Integer quantity, BillType billType) {
        this.id = id;
        this.createDate = createDate;
        this.quantity = quantity;
        this.billType = billType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

}
