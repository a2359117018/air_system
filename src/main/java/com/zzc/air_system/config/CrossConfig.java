package com.zzc.air_system.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ZhuBaiXuan
 * @Title: 跨域
 * @Package
 * @Description:
 * @date 2022/4/28  23:48
 */
@Configuration
public class CrossConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                //允许远程访问的域名
                .allowedOriginPatterns("*")
                //允许请求的方法
                .allowedMethods("POST", "GET", "PUT", "DELETE", "OPTIONS")
                .allowCredentials(true)
                .maxAge(3000)
                .allowedHeaders("*");
    }
}
