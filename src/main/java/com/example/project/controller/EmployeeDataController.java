package com.example.project.controller;

import com.example.project.processors.EmployeeProcessor;
import com.example.project.service.EmployeeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class EmployeeDataController
{

    @Autowired
    public EmployeeDataService employeeDataService;

    @GetMapping("/check")
    public void checkId(@RequestParam("id") int id)throws Exception
    {
        employeeDataService.checkIdIsPresent(id);
    }

}
