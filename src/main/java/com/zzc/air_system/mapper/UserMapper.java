package com.zzc.air_system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzc.air_system.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<UserDomain> {

    List<UserDomain> selectAll();
}
