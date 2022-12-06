package com.example.employee_app_backend.controller;

import com.example.employee_app_backend.model.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String home()
    {
        return "welcome employee !!";
    }

    @PostMapping(path="/add", consumes = "application/json", produces = "application/json")
    public String add(@RequestBody Employees e)

    {
        System.out.println(e.getId());
        System.out.println(e.getEmpcode());
        System.out.println(e.getDesignation());
        System.out.println(e.getMobno());
        System.out.println(e.getUsername());
        System.out.println(e.getPassword());

        return "employee added successfully";
    }

    @PostMapping("/search")
    public String Search()
    {
        return "search page";
    }


    @PostMapping("/edit")
    public String Edit()
    {
        return "edit page";
    }

    @GetMapping("/viewall")
    public  String ViewAll()
    {
        return "view all";
    }

    @PostMapping("/delete")
    public  String Delete()
    {
        return "delete page";
    }


}
