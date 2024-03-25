package com.RestApi.SpringBoot.service;

import com.RestApi.SpringBoot.entity.Order;

import java.util.List;

public interface OrderService {

    void addOrder(Order order);

    List<Order> getOrders();

    Order getOrder(Integer id);
}
