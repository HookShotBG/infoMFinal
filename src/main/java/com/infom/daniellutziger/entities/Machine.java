package com.infom.daniellutziger.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMachine;

    @NotNull
    private String machineName;

    @NotNull
    private String kuerzel;

    @ManyToMany(mappedBy = "machines")
    private List<Order> orders;

    public Machine(){}

    public Machine(String machineName, String kuerzel, List<Order> orders) {
        this.machineName = machineName;
        this.kuerzel = kuerzel;
        this.orders = orders;
    }

    public Long getIdMachine() {
        return idMachine;
    }

    public void setIdMachine(Long idMachine) {
        this.idMachine = idMachine;
    }

    public String getName() {
        return machineName;
    }

    public void setName(String machineName) {
        this.machineName = machineName;
    }

    public String getKuerzel() {
        return kuerzel;
    }

    public void setKuerzel(String kuerzel) {
        this.kuerzel = kuerzel;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
