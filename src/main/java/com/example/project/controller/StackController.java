package com.example.project.controller;

import com.example.project.service.StackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
