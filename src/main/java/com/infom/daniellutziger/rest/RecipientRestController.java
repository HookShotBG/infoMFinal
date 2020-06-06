package com.infom.daniellutziger.rest;

import com.infom.daniellutziger.entities.Recipient;
import com.infom.daniellutziger.repositories.RecipientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recipient")
public class RecipientRestController {

    @Autowired
    private RecipientRepository rr;

    @GetMapping("")
    public List<Recipient> returnAllRecipients(){
        return rr.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Recipient> returnRecipientById(@PathVariable long id){
        return rr.findById(id);
    }
}
