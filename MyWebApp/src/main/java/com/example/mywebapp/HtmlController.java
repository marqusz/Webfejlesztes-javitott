package com.example.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("")
    public  String homePage(){
        return "index";
    }
}
