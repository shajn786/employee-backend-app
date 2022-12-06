package com.example.employee_app_backend.dao;

import com.example.employee_app_backend.model.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employees, Integer> {
}
