package com.example.employee_app_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String home()
    {
        return "welcome employee !!";
    }

    @GetMapping("/add")
    public String add()
    {
        return "home page";
    }

    @GetMapping("/search")
    public String Search()
    {
        return "search page";
    }


    @GetMapping("/edit")
    public String Edit()
    {
        return "edit page";
    }

    @GetMapping("/viewall")
    public  String ViewAll()
    {
        return "view all";
    }

    @GetMapping("/delete")
    public  String Delete()
    {
        return "delete page";
    }


}
