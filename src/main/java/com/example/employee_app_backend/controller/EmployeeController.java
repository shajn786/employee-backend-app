package com.example.employee_app_backend.controller;

import com.example.employee_app_backend.dao.EmployeeDao;
import com.example.employee_app_backend.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController {


    @Autowired
    private EmployeeDao dao;
    @GetMapping("/")
    public String home()
    {
        return "welcome employee !!";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/add", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> add(@RequestBody Employees e)

    {
        System.out.println(e.getId());
        System.out.println(e.getEmpcode());
        System.out.println(e.getDesignation());
        System.out.println(e.getMobno());
        System.out.println(e.getUsername());
        System.out.println(e.getPassword());
        dao.save(e);
        HashMap<String, String> map =new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/search", consumes = "application/json", produces = "application/json")
    public List<Employees> Search(@RequestBody Employees e)
    {
        String empcode= String.valueOf(e.getEmpcode());
        System.out.println(empcode);
        return (List<Employees>) dao.SearchEmployee(e.getEmpcode());

    }


    @PostMapping("/edit")
    public String Edit()
    {
        return "edit page";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Employees> ViewAll()
    {
        return (List<Employees>)dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/delete", consumes = "application/json",produces = "application/json")
    public  HashMap<String,String> Delete(@RequestBody Employees e)
    {
        String empid = String.valueOf(e.getId());
        System.out.println(empid);
        dao.DeleteEmployee(e.getId());
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }


}
