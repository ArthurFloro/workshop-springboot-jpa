package com.arthurfloro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurfloro.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
