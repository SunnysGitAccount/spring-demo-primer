package com.dev.sunny.domain.user.service.impl;

import com.dev.sunny.domain.user.model.MUser;
import com.dev.sunny.domain.user.service.UserService;
import com.dev.sunny.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper mapper;

    @Override
    public void signUp(MUser user) {
        user.setDepartmentId(1);
        user.setRole("ROLE_GENERAL");

        this.mapper.insertOne(user);
    }
}