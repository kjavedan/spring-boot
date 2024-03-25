package com.RestApi.SpringBoot.controller;

import com.RestApi.SpringBoot.entity.Order;
import com.RestApi.SpringBoot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;
    @PostMapping("/add")
    public String addOrder(@RequestBody Order order){
        orderService.addOrder(order);

        return "Order added successfully";
    }

    @GetMapping("/list")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    @GetMapping("/get")
    public Order getOrder(Integer id){
        return orderService.getOrder(id);
    }


}
