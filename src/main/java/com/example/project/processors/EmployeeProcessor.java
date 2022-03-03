package com.example.project.processors;

import com.example.project.controller.EmployeeDataController;
import com.example.project.entity.Employee;
import com.example.project.repository.EmployeeDataRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class EmployeeProcessor implements Processor
{

    @Autowired
    public EmployeeDataRepository employeeDataRepository;

    @Autowired
    public EmployeeDataController employeeDataController;

    public String convertedMessage;

    @Override
    public void process(Exchange exchange) throws Exception
    {
        ObjectMapper objectMapper=new ObjectMapper();
        try {

            convertedMessage = (String) exchange.getMessage().getBody();
            //exchange.getMessage().setBody(convertedMessage);
            System.out.println(convertedMessage);
            Employee employeeData = objectMapper.readValue(convertedMessage, Employee.class);



            employeeDataRepository.save(employeeData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
