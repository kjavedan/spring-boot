package com.RestApi.SpringBoot.service.impl;

import com.RestApi.SpringBoot.entity.Order;
import com.RestApi.SpringBoot.repository.OrderRepository;
import com.RestApi.SpringBoot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public void addOrder(Order order){
        orderRepository.save(order);
    }

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrder(Integer id) {
        Order order;
        order = orderRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid order id " + id));
        return order;
    }

}
