package com.example.project.controller;



import com.example.project.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.Mapping;


@RestController
@RequestMapping
public class CompanyController {
    @Autowired
    public CompanyService companyService;


    @GetMapping("/companyentities")
    public String getcompanyentity(@RequestParam String name, @RequestParam int networth) throws Exception
    {
        return "Name "+name+" Net_Worth "+networth;

    }

    @PostMapping("/companyentities")
    public void createcompanyentity(@RequestParam("companyName") String name, @RequestParam("netWorth") int networth) throws Exception {
        companyService.saveCompany(name,networth);
    }


}
