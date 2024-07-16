package com.dev.sunny.controllers;

import com.dev.sunny.domain.user.model.MUser;
import com.dev.sunny.domain.user.service.UserService;
import com.dev.sunny.form.UserDetailForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@Slf4j
@RequiredArgsConstructor
public class UserDetailController {

    private final UserService userService;
    private final ModelMapper modelMapper;

    @GetMapping("/detail/{userId:.+}")
    public String getUserDetails(UserDetailForm form,
                                 Model model,
                                 @PathVariable("userId") String userId) {
        log.info("userId: {}", userId);

        MUser user = this.userService.getUserById(userId);
        user.setPassword(null);

        form = modelMapper.map(user, UserDetailForm.class);

        model.addAttribute("userDetailForm", form);
        return "user/details";
    }

    @PostMapping(value = "/detail", params = "update")
    public String updateUser(UserDetailForm form, Model model) {
        this.userService.updateUser(form.getUserId(),
                form.getPassword(),
                form.getUserName());

        return "redirect:/user/list";
    }

    @PostMapping(value = "/detail", params = "delete")
    public String deleteUser(UserDetailForm form, Model model) {
        this.userService.deleteUser(form.getUserId());

        return "redirect:/user/list";
    }

}
