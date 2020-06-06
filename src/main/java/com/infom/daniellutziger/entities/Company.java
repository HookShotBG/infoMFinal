package com.infom.daniellutziger.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@MappedSuperclass
public abstract class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompany;

    //companyname
    public String name;


    public Company(){}

    public Company(String name) {
        this.name = name;
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
