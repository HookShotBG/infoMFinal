package com.infom.daniellutziger.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.istack.NotNull;

import javax.persistence.*;

//Superclass is not an entity -> hence no repository nor controller for this
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idCompany")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompany;

    //companyname
    @NotNull
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
