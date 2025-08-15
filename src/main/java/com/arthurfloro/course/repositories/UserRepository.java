package com.arthurfloro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurfloro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
