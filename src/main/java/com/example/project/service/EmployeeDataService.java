package com.example.project.service;


import com.example.project.repository.EmployeeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDataService
{
    @Autowired
    public EmployeeDataRepository employeeDataRepository;

    public void checkIdIsPresent(int id)
    {

        if(employeeDataRepository.getById(id)!=null)
        {
            System.out.println("This ID is present");
            
        }
        else
        {
            System.out.println("This Id is not Present");
        }
    }
}
