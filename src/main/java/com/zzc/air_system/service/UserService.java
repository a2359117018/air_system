package com.zzc.air_system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzc.air_system.model.UserDomain;

import java.util.List;

public interface UserService extends IService<UserDomain> {

    List<UserDomain> selectAll();
}
