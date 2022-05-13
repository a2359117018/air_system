package com.zzc.air_system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzc.air_system.mapper.UserMapper;
import com.zzc.air_system.model.UserDomain;
import com.zzc.air_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDomain> implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDomain> selectAll() {
        return userMapper.selectAll();
    }
}
