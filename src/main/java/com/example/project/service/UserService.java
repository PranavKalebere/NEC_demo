package com.example.project.service;

import com.example.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class UserService
{
    @Autowired
    public UserRepository userRepository;

    public void checkTheToken(String token) throws Exception
    {
        if(userRepository.getByToken(token)==null)
        {
            throw new Exception("Invalid User");
        }
    }
}
