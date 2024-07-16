package com.dev.sunny.domain.user.model;

import lombok.Data;

import java.util.Date;

@Data
public class MUser {
    private String userId;
    private String userName;
    private String password;
    private String confirmPassword;
    private Date dateOfBirth;
    private Integer age;
    private Integer gender;
    private Integer departmentId;
    private String role;
}
