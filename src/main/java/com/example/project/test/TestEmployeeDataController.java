package com.example.project.test;


import com.example.project.controller.EmployeeDataController;
import com.example.project.entity.Employee;
import com.example.project.repository.EmployeeDataRepository;
import com.example.project.service.EmployeeDataService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestEmployeeDataController
{
    @InjectMocks
    public EmployeeDataService employeeDataService;

    @Mock
    EmployeeDataRepository employeeDataRepository;

    @Before
    public void init()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = Exception.class)
    public void testCheckId() throws Exception {
        Employee emp=new Employee();
        when(employeeDataRepository.getById(9)).thenReturn(null);
        employeeDataService.checkIdIsPresent(9);
    }




}
