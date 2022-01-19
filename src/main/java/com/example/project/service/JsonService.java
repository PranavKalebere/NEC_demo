package com.example.project.service;

import com.example.project.entity.JsonEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

//import java.io.File;
import java.io.*;
//import java.nio.file.Files;

@Component
public class JsonService
{

    public void display(String id, String name)
    {

        JsonEntity jsonEntity=new JsonEntity(Integer.parseInt(id),name);
        ObjectMapper objectMapper=new ObjectMapper();
        {
            try {
                String json = objectMapper.writeValueAsString(jsonEntity);
                System.out.println("JSON = " + json);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public void getValue()
    {
        String s1="{\"id\":1,\"name\":\"Pranav\"}";
        ObjectMapper objectMapper=new ObjectMapper();
        {
            try {
                JsonEntity jsonEntity=objectMapper.readValue(s1,JsonEntity.class);
                System.out.println(jsonEntity.getId());


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void readValue()
    {
        ObjectMapper objectMapper=new ObjectMapper();
        try
        {
            JsonEntity jsonEntity= objectMapper.readValue(new File("C:\\java\\Json\\Jsondemo.json"), JsonEntity.class);
            System.out.println(jsonEntity.getId());
            System.out.println(jsonEntity.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void writeValue(int id, String name) throws IOException {
        File file=new File("C:\\java\\Json\\jsondemo3.json");
        if (file.createNewFile()){
            System.out.println("file created");
        }
        else {
            System.out.println("File not created");
        }
        ObjectMapper objectMapper=new ObjectMapper();
        JsonEntity jsonEntity=new JsonEntity(id,name);

        try
        {
             objectMapper.writeValue(file,jsonEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
