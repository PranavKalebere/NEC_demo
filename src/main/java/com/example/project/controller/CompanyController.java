package com.example.project.controller;



import com.example.project.entity.CompanyEntity;
import com.example.project.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.Mapping;

import java.util.Collection;


@RestController
@RequestMapping
public class CompanyController {
    @Autowired
    public CompanyService companyService;


    @PostMapping("/companyentities")
    public void createcompanyentity() throws Exception {
        companyService.run();
    }


}
