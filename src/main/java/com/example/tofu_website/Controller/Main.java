package com.example.tofu_website.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {
    @GetMapping("/")
    public String home(){
        return "homx";
    }
	
    //Hej Tofu!!!!
    //Tofu siger hej til LauLau <3

	//this is a new branch called featureLaura

}
