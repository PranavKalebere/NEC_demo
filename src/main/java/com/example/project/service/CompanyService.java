package com.example.project.service;

import com.example.project.entity.CompanyEntity;
import com.example.project.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompanyService
{
    @Autowired
    public CompanyRepo companyrepo;


    public void saveCompany(String name, int networth) throws Exception
    {
       // companyrepo.save(new CompanyEntity("Pqr", 6000));
        companyrepo.save(new CompanyEntity(name,networth));

    }
}
