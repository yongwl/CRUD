package com.example.net.javaguides.springbootbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.net.javaguides.springbootbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}