package com.dev.sunny.controllers;

import com.dev.sunny.form.SignupForm;
import com.dev.sunny.service.UserApplicationService;
import com.dev.sunny.validations.GroupOrder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class SignupController {

    private final UserApplicationService userService;

    /**
     * Display the user signup screen
     * @param model to transfer objects to view
     * @return view 'signup'
     */
    @GetMapping("/signup")
    public String getSignup(Model model,
                            Locale locale,
                            @ModelAttribute("signupForm") SignupForm signupForm) {
        Map<String, Integer> genderMap = this.userService.getGenderMap(locale);

        model.addAttribute("genders", genderMap);

        return "user/signup";
    }

    /**
     * User Signup process
     *
     * @return redirect to log in screen
     */
    @PostMapping("/signup")
    public String postSignup(Model model,
                             Locale locale,
                             @Validated(GroupOrder.class) @ModelAttribute("signupForm") SignupForm signupForm,
                             BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("bindingResult: {}", bindingResult);
            log.info("signupForm with errors: {}", signupForm);
            return getSignup(model, locale, signupForm);
        }

        log.info("signupForm: {}", signupForm);
        return "redirect:/login";
    }
}
