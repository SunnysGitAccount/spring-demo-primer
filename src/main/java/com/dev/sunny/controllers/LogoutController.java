package com.dev.sunny.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class LogoutController {

    @PostMapping("/logout")
    public String logout() {
        log.info("Performing Logout. Redirecting to login page.");
        return "redirect:/login";
    }
}