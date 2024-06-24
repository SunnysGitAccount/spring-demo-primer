package com.dev.sunny.domain.user.service;

import com.dev.sunny.domain.user.model.MUser;

import java.util.List;

public interface UserService {

    void signUp(MUser user);
    List<MUser> getUsers();

}
