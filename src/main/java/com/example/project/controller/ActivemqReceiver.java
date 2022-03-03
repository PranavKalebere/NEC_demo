package com.example.project.controller;

import com.example.project.processors.EmployeeProcessor;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ActivemqReceiver extends RouteBuilder
{
    @Autowired
    private EmployeeProcessor employeeProcessor;
   // private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ActivemqReceiver.class);
    @Override
    public void configure() throws Exception {
        from("activemq:TestQueue")
                .log(LoggingLevel.DEBUG, String.valueOf(log), "New message received")
                .process(employeeProcessor)
                .log(LoggingLevel.DEBUG, "Message is successfully sent to the output queue")
                .end();

    }


}
