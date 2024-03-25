package com.RestApi.SpringBoot.repository;

import com.RestApi.SpringBoot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
