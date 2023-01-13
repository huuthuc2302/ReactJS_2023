package com.codegym.reactjss3.model.bill;

import javax.persistence.*;

@Entity
public class BillType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameBill;

    public BillType() {
    }

    public BillType(Integer id, String nameBill) {
        this.id = id;
        this.nameBill = nameBill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBill() {
        return nameBill;
    }

    public void setNameBill(String nameBill) {
        this.nameBill = nameBill;
    }

}
