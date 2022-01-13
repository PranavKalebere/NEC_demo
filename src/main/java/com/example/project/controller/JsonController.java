package com.example.project.controller;

import com.example.project.entity.JsonEntity;
import com.example.project.service.JsonService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class JsonController
{
    @Autowired
    public JsonService jsonService;

    @GetMapping("/jsonentity")
    public void getData(@RequestParam("id")String id,@RequestParam("name")String name)
    {
        jsonService.display(id,name);
    }


    @GetMapping("/jsonentity1")
    public void getString()
    {
        jsonService.getValue();
    }

}



//{"id":1,"name":"Pranav"}