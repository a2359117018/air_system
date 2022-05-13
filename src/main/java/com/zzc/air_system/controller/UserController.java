package com.zzc.air_system.controller;

import com.zzc.air_system.model.UserDomain;
import com.zzc.air_system.redisConfig.RedisUtil;
import com.zzc.air_system.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.logging.Logger;

/**
 * @author ZhuBaiXuan
 * @Title: 用户操作类
 * @Package
 * @Description: 包含登录，注册等用户基本信息
 * @date 2022/4/28  23:56
 */

@RestController("UserController")
@RequestMapping("/users")
public class UserController {

    // 用户类日志
    public static final Logger logger = Logger.getLogger("userLogger");

    @Resource
    private UserServiceImpl userService;
    @Resource
    private RedisUtil redisUtil;


    /**
     * 跳转到首页
     */
    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView md = new ModelAndView();
        md.setViewName("index");
        redisUtil.set("abc", "Redis");
        logger.info((String) redisUtil.get("abc"));
        redisUtil.lSet("users", userService.selectAll());
        return md;
    }

    /**
     * 注册
     */
    @RequestMapping("/userRegister")
    public String userRegister(UserDomain users) {
        if (null == users) {
            return "False";
        }
        redisUtil.lSet("userInfo", users, 300000);
        logger.info(String.valueOf(redisUtil.lGet("userInfo", 0, 10)));

        return "";
    }


    /**
     * 登录
     */
    @RequestMapping("/userLogin")
    public void userLogin() {

    }

}
