package com.infom.daniellutziger.entities;

import javax.persistence.*;

@Entity
public class Recipient extends Company {

    //shipping address
    private String address;

    @ManyToOne
    private Order singleOrder;

    public Recipient(){}

    public Recipient(String name) {
        super(name);
    }

    public Recipient(String name, String address, Order singleOrder) {
        super(name);
        this.address = address;
        this.singleOrder = singleOrder;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Order getSingleOrder() {
        return singleOrder;
    }

    public void setSingleOrder(Order singleOrder) {
        this.singleOrder = singleOrder;
    }
}
