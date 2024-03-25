package com.RestApi.SpringBoot.service.impl;

import com.RestApi.SpringBoot.entity.Order;
import com.RestApi.SpringBoot.repository.OrderRepository;
import com.RestApi.SpringBoot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void addOrder(Order order){
        orderRepository.save(order);
    }
}
