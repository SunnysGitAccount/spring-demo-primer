package com.dev.sunny.form;

import com.dev.sunny.validations.FirstOrder;
import com.dev.sunny.validations.SecondOrder;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class SignupForm {
    @NotBlank(groups = {FirstOrder.class})
    @Email(groups = {SecondOrder.class})
    private String userId;

    @NotBlank(groups = {FirstOrder.class})
    private String username;

    @NotBlank(groups = {FirstOrder.class})
    @Length(min = 8, max = 20, groups = {FirstOrder.class})
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,25}$", groups = {SecondOrder.class})
    private String password;

    @NotBlank(groups = {FirstOrder.class})
    private String confirmPassword;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(groups = {FirstOrder.class})
    private Date dateOfBirth;

    @Min(value = 20, groups = {SecondOrder.class})
    @Max(value = 100, groups = {SecondOrder.class})
    @NotNull(groups = {FirstOrder.class})
    private Integer age;

    @NotNull(groups = {FirstOrder.class})
    private Integer gender;
}
