package com.infom.daniellutziger.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "id_manufacturer")
public class Manufacturer extends Company{

    //the employee responsible for the product
    private String contactEmployee;

    //what department the product comes from
    private String department;

    @OneToMany(mappedBy = "manufacturer")
    private List<Order> orders;

    public Manufacturer(){}

    public Manufacturer(String name) {
        super(name);
    }

    public Manufacturer(String name, String contactEmployee, String department, List<Order> orders) {
        super(name);
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
