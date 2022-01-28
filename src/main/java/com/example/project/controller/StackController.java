package com.example.project.controller;

import com.example.project.service.StackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StackController
{
    @Autowired
    StackService stackService;

    @PostMapping("/stackput")
    public void putData(@RequestParam("num")int num)
    {
        stackService.insertdata(num);
    }
}
