package com.example.project.controller;

import com.example.project.entity.JsonEntity;
import com.example.project.service.JsonService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

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

    @GetMapping("/jsonentity2")
    public void readData() {
        jsonService.readValue();
    }


    @PostMapping("/jsonentity3")
    public void writeData(@RequestParam("id")int id,@RequestParam("name")String name) throws IOException {
        jsonService.writeValue(id,name);
    }

}



//{"id":1,"name":"Pranav"}