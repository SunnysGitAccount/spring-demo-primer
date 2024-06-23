package com.dev.sunny.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String getHome() {
        return "index";
    }
    
    @PostMapping(value = "/")
    public String greetUser(@RequestParam("user") String name, Model model) {
    	model.addAttribute("userName", name);

    	return "hello/response";
    }

}
