package com.zzc.air_system.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @Title:
 * @Package
 * @Description:
 * @date 2022/4/1418:55
 */
@Configuration
public class SessionInterceptor implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> list = new ArrayList<>();
        list.add("/users/userRegister");
        list.add("/users/index");
    }
}
