package com.infom.daniellutziger.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Manufacturer extends Company{

    //the employee responsible for the product
    private String contactEmployee;

    //what department the product comes from
    @NotNull
    private String department;

    @OneToMany(mappedBy = "manufacturer")
    @JsonIgnore
    private List<Order> orders;

    public Manufacturer(){}

    public Manufacturer(String name, String sector) {
        super(name, sector);
    }

    public Manufacturer(String name, String sector, String contactEmployee, String department, List<Order> orders) {
        super(name, sector);
        this.contactEmployee = contactEmployee;
        this.department = department;
        this.orders = orders;
    }

    public String getContactEmployee() {
        return contactEmployee;
    }

    public void setContactEmployee(String contactEmployee) {
        this.contactEmployee = contactEmployee;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
