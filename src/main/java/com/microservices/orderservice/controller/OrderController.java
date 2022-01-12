package com.microservices.orderservice.controller;

import com.microservices.orderservice.entity.Order;
import com.microservices.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/addOrder")
    public Order addOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @GetMapping("/{id}")
    public Order findCartById(@PathVariable long id) {
        return orderService.getOrderById(id);
    }
}
