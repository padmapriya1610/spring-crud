package com.example.springcrudexample.repository;

import com.example.springcrudexample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);

    List<Product> findAll();
}

