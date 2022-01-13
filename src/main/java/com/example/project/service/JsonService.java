package com.example.project.service;

import com.example.project.entity.JsonEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

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
}
