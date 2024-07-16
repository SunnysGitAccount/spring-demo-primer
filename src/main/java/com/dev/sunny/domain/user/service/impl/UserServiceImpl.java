package com.dev.sunny.domain.user.service.impl;

import com.dev.sunny.domain.user.model.MUser;
import com.dev.sunny.domain.user.service.UserService;
import com.dev.sunny.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserMapper mapper;

    @Override
    public void signUp(MUser user) {
        user.setDepartmentId(1);
        user.setRole("ROLE_GENERAL");

        this.mapper.insertOne(user);
    }

    @Override
    public List<MUser> getUsers() {
        return this.mapper.findAll();
    }

    @Override
    public MUser getUserById(String userId) {
        return this.mapper.findOne(userId);
    }

    @Override
    public void updateUser(String userId, String password, String userName) {
        this.mapper.updateOne(userId, password, userName);
    }

    @Override
    public void deleteUser(String userId) {
        int count = this.mapper.deleteOne(userId);
        if (count > 0) {
            log.info("Delete success");
        } else {
            log.info("Delete failed");
        }
    }
}
