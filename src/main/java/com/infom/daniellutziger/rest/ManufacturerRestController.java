package com.infom.daniellutziger.rest;

import com.infom.daniellutziger.entities.Manufacturer;
import com.infom.daniellutziger.repositories.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/manufacturer")
public class ManufacturerRestController {

    @Autowired
    private ManufacturerRepository mr;

    @GetMapping("")
    public List<Manufacturer> returnAllManufacturers(){
        return mr.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Manufacturer> returnManufacturerById(@PathVariable long id){
        return mr.findById(id);
    }
}
