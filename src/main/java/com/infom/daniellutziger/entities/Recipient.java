package com.infom.daniellutziger.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recipient extends Company {

    //shipping address
    @NotNull
    private String address;

    @OneToMany(mappedBy = "recipient")
    @JsonIgnore
    private List<Order> orders;

    public Recipient(){}

    public Recipient(String name, String sector) {
        super(name, sector);
    }

    public Recipient(String name, String sector, String address, List<Order> orders) {
        super(name, sector);
        this.address = address;
        this.orders = orders;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
