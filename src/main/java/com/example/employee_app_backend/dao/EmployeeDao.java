package com.example.employee_app_backend.dao;

import com.example.employee_app_backend.model.Employees;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employees, Integer> {

    @Query(value = "SELECT `id`, `company_name`, `designation`, `empcode`, `empname`, `mobno`, `password`, `salary`, `username` FROM `employees` WHERE `empcode`= :empcode ",nativeQuery = true)
    List<Employees> SearchEmployee(@Param("empcode") Integer empcode);

    @Modifying
    @Transactional
    @Query(value="DELETE FROM `employees` WHERE `id` = :id",nativeQuery = true)
    void DeleteEmployee(@Param("id") Integer id);
}
