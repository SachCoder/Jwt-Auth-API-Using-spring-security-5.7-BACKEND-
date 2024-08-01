package com.sachcoder.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Home {
	 @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/welcome")
    public String welcome() {
     
        return "this page is not allowed to unauthenticated users";
    }


    @GetMapping("/getusers")
    public String getUser() {
        return "{\"name\":\"Sachin\"}";
    }

}
