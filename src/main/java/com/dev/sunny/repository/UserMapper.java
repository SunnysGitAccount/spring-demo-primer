package com.dev.sunny.repository;

import com.dev.sunny.domain.user.model.MUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public int insertOne(MUser user);

}
