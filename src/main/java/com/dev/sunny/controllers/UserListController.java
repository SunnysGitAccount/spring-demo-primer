package com.dev.sunny.controllers;

import com.dev.sunny.domain.user.model.MUser;
import com.dev.sunny.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserListController {

    private final UserService userService;

    @GetMapping("/list")
    public String userList(Model model) {
        List<MUser> users = this.userService.getUsers();
        log.info("users: {}", users);

        model.addAttribute("users", users);

        return "user/list";
    }
}