package com.microservices.orderservice.service;

import com.microservices.orderservice.entity.Order;
import com.microservices.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order getOrderById(long id) {
        return orderRepository.findById(id).orElse(null);
    }
}
