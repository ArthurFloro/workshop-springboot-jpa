package com.arthurfloro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurfloro.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
