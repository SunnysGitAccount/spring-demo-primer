package com.dev.sunny.repository;

import com.dev.sunny.domain.user.model.MUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    void insertOne(MUser user);
    List<MUser> findAll();

}
