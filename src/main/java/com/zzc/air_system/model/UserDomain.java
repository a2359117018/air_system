package com.zzc.air_system.model;

import lombok.Data;

/**
 * @author ZhuBaiXuan
 * @Title: 用户实体类
 * @Package 模型
 * @Description:
 * @date 2022/4/1312:40
 */
public class UserDomain {
    private String Id;
    private String mobile;
    private String email;
    private String userName;
    private String passWord;
    private String nickName;
    private String gender;
    private String portrait;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    @Override
    public String toString() {
        return "UserDomain{" +
                "Id='" + Id + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", nickName='" + nickName + '\'' +
                ", gender='" + gender + '\'' +
                ", portrait='" + portrait + '\'' +
                '}';
    }
}
