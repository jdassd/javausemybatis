package com;

import com.domain.User;
import com.mapper.UserMapper;
import com.utils.MybatisUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 2020.4.19 测试
        UserMapper userMapper = MybatisUtils.getSqlSession().getMapper(UserMapper.class);
        List<User> userList = userMapper.selectAll();
        System.out.println(userList);
    }
}
