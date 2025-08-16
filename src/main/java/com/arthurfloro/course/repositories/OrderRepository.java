package com.arthurfloro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurfloro.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
