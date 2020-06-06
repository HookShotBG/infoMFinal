package com.infom.daniellutziger.entities;

import javax.persistence.*;

@Entity
public class Manufacturer extends Company{

    //the employee responsible for the product
    private String contactEmployee;

    //what department the product comes from
    private String department;

    @ManyToOne
    private Order singleOrder;

    public Manufacturer(){}

    public Manufacturer(String name) {
        super(name);
    }

    public Manufacturer(String name, String contactEmployee, String department, Order singleOrder) {
        super(name);
        this.contactEmployee = contactEmployee;
        this.department = department;
        this.singleOrder = singleOrder;
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

    public Order getSingleOrder() {
        return singleOrder;
    }

    public void setSingleOrder(Order singleOrder) {
        this.singleOrder = singleOrder;
    }

}
