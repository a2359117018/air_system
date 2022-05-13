package com.zzc.air_system.config;

/**
 * @author ZhuBaiXuan
 * @Title: 状态码枚举类
 * @Package
 * @Description:
 * @date 2022/5/2  21:42
 */
public enum Status {

    //公共异常码
    SUCCESS(6000, "成功"),
    SYSTEM_ERROR(9999, "系统异常"),
    UNKNOWN_ERROR(9998, "未知异常"),
    //登录异常码
    LOGIN_EXPIRE(2001, "未登录或者登录失效"),
    LOGIN_CODE_ERROR(2002, "登录验证码错误"),
    LOGIN_ERROR(2003, "用户名不存在或密码错误"),
    LOGIN_USER_STATUS_ERROR(2004, "用户状态不正确"),
    LOGOUT_ERROR(2005, "退出失败，token不存在"),
    LOGIN_USER_NOT_EXIST(2006, "该用户不存在"),
    LOGIN_USER_EXIST(2007, "该用户已存在");


    public Integer code;
    public String message;

    Status(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
