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

    @GetMapping("/byDate/{date}")
    public List<String> getCompanyNames(@PathVariable String date){
        //prefixed date
        //String str="2018-03-31";
        //http://localhost:8080/company/byDate/2020-03-31
        Date generatedDate =Date.valueOf(date);
        List<String> names = cr.getCompanyNameByManufacturerByOrderByOrderDate(generatedDate);
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
