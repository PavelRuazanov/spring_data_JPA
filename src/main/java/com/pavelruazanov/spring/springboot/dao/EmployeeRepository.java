package com.pavelruazanov.spring.springboot.dao;

import com.pavelruazanov.spring.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
