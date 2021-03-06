package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);
    Employee findOne(Long id);
    List<Employee> findAll();
}
