package com.infom.daniellutziger.rest;

import com.infom.daniellutziger.entities.Order;
import com.infom.daniellutziger.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderRestController {

    @Autowired
    private OrderRepository or;

    @GetMapping("")
    public List<Order> returnAllOrders(){
        return or.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> returnOrderById(@PathVariable long id){
        return or.findById(id);
    }
}
