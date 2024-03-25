package com.RestApi.SpringBoot.repository;

import com.RestApi.SpringBoot.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
