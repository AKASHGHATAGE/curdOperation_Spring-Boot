package com.example.curd_operation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curd_operation.entites.Employee;

public interface employeedao extends JpaRepository<Employee,Long> {

}
