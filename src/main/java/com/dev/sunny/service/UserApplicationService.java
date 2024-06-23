package com.dev.sunny.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserApplicationService {

    private final MessageSource messageSource;

    /**
     * Generate a gender map
     * @return different genders supported for now in an unmodifiable Map.
     * */
    public Map<String, Integer> getGenderMap(Locale locale) {
//        return linked hash map of genders
        Map<String, Integer> genderMap = new LinkedHashMap<>();

        String male = messageSource.getMessage("user.signup.label.male", null, locale);
        String female = messageSource.getMessage("user.signup.label.female", null, locale);

        genderMap.put(male, 1);
        genderMap.put(female, 2);

        return genderMap;
    }
}
