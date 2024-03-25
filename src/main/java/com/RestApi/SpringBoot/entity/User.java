package com.RestApi.SpringBoot.entity;

import jakarta.persistence.GeneratedValue;
import lombok.Data;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.Entity;

import java.util.Iterator;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer age;
    private String name;

}
