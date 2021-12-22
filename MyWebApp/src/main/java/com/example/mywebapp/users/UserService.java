package com.example.mywebapp.users;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired private UserRepository repo;

    public List<User> listAll(){
        return (List<User>) repo.findAll();
    }



}
