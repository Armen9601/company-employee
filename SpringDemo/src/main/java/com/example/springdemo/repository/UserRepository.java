package com.example.springdemo.repository;

import com.example.springdemo.entyty.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {



}
