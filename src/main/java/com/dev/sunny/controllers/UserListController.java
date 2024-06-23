package com.dev.sunny.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserListController {

    @GetMapping("/list")
    public String userList() {
        return "user/list";
    }
}