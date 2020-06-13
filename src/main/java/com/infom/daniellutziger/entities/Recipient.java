package com.infom.daniellutziger.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "id_recipient")
public class Recipient extends Company {

    //shipping address
    @NotNull
    private String address;

    @OneToMany(mappedBy = "recipient")
    private List<Order> orders;

    public Recipient(){}

    public Recipient(String name) {
        super(name);
    }

    public Recipient(String name, String address, List<Order> orders) {
        super(name);
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
