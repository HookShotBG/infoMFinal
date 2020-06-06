package com.infom.daniellutziger.rest;

import com.infom.daniellutziger.entities.Company;
import com.infom.daniellutziger.entities.Machine;
import com.infom.daniellutziger.repositories.CompanyRepository;
import com.infom.daniellutziger.repositories.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/machine")
public class MachineRestController {

    @Autowired
    private MachineRepository mr;

    @GetMapping("")
    public List<Machine> returnAllMachines(){
        return mr.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Machine> returnMachineById(@PathVariable long id){
        return mr.findById(id);
    }
}