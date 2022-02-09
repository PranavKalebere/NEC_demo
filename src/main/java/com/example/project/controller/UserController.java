package com.example.project.controller;

import com.example.project.service.EmployeeService;
import com.example.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping
public class UserController
{
    @Autowired
    public UserService userService;

    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/checkToken")
    public void getToken(@RequestParam("token") String token) throws Exception
    {
        userService.checkTheToken(token);
    }

    @PostMapping("/Upload")
    public void uploadData(@RequestParam("file")MultipartFile file) throws Exception
    {
        employeeService.getFile(file);

    }
}
