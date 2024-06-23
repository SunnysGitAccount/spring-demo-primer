package com.dev.sunny.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	/**
	 * Display Login screen
	 * @return view 'login' for login page
	 */
	@GetMapping("/login")
	public String getLogin() {
		return "login/login";
	}

	@PostMapping("/login")
	public String postLogin() {
		return "redirect:/user/list";
	}
}
