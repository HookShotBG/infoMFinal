package com.infom.daniellutziger.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

//Superclass is not an entity -> hence no repository nor controller for this
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompany;

    //companyname
    @NotNull
    public String name;

    @NotNull
    public String sector;


    public Company(){}

    public Company(String name, String sector) {
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

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
