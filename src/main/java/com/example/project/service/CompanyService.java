package com.example.project.service;

import com.example.project.entity.CompanyEntity;
import com.example.project.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyService
{
    @Autowired
    public CompanyRepo companyrepo;

    public void run() throws Exception
    {
       // companyrepo.save(new CompanyEntity("Pqr", 6000));
        companyrepo.save(new CompanyEntity("abc",5000));
       /* List<CompanyEntity> companyEntityList=new ArrayList<>();
        companyEntityList.add(new CompanyEntity("erw",7000));
        companyEntityList.add(new CompanyEntity("Pqr",6000));
        companyrepo.saveAll(companyEntityList);*/



    }
}
