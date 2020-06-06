package com.infom.daniellutziger.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="ordertable")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrder;

    private Date orderDate;

    //currency in which the order had been made
    private String currency;
    //price of the order
    private double price;

    @OneToMany
    @JsonIgnore
    private List<Manufacturer> manufacturers;

    @OneToMany
    @JsonIgnore
    private List<Recipient> recipients;

    @ManyToMany
    @JsonIgnore
    private List<Machine> machines;


    public Order() {
    }

    public Order(Date orderDate, String currency, double price, List<Manufacturer> manufacturers, List<Recipient> recipients, List<Machine> machines) {
        this.orderDate = orderDate;
        this.currency = currency;
        this.price = price;
        this.manufacturers = manufacturers;
        this.recipients = recipients;
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

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public List<Recipient> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<Recipient> recipients) {
        this.recipients = recipients;
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
}
