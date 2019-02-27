package com.example.test.entity.mapper;

import com.example.test.entity.user;
import org.springframework.stereotype.Repository;

@Repository
public interface userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer id);
}