package com.infom.daniellutziger.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="ordertable")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrder;

    private Date orderDate;

    //currency in which the order had been made
    private String currency;
    //price of the order
    private double price;

    @ManyToOne
    private Manufacturer manufacturer;

    @ManyToOne
    private Recipient recipient;

    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "order_machine",
            joinColumns = @JoinColumn(name = "id_order"),
            inverseJoinColumns = @JoinColumn(name = "id_machine"))
    private List<Machine> machines;


    public Order() {
    }

    public Order(Date orderDate, String currency, double price, Manufacturer manufacturer, Recipient recipient, List<Machine> machines) {
        this.orderDate = orderDate;
        this.currency = currency;
        this.price = price;
        this.manufacturer = manufacturer;
        this.recipient = recipient;
        this.machines = machines;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }
}
