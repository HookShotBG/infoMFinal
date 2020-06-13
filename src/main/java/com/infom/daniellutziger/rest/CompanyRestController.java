package com.infom.daniellutziger.rest;

import com.infom.daniellutziger.entities.Company;
import com.infom.daniellutziger.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyRestController {

    @Autowired
    private CompanyRepository cr;

    @GetMapping("/xnxx")
    public List<String> getCompanyNames(){
        String str="2018-03-31";
        Date sff=Date.valueOf(str);
        List<String> names = cr.getCompanyNameByManufacturerByOrderByOrderDate(sff);
        return names;
    }

    @GetMapping("")
    public List<Company> returnAllCompanies(){
        return cr.findAll();
    }

    @GetMapping("{id}")
    public Optional<Company> returnSingleCompanyBasedOnId(@PathVariable long id){
        return cr.findById(id);
    }
}
