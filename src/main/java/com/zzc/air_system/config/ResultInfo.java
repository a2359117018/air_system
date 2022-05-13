package com.zzc.air_system.config;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ZhuBaiXuan
 * @Title:
 * @Package
 * @Description: 返回结果统一封装类
 * @date 2022/5/2  21:17
 */
@Data
public class ResultInfo implements Serializable {

    private Integer code;

    private String message;

    private Object result;

    private Integer total;


    public ResultInfo() {
        super();
    }

    public ResultInfo(Status status) {
        super();
        this.code = status.code;
        this.message = status.message;
    }

    public ResultInfo resultInfo(Object result) {
        this.result = result;
        return this;
    }

    public ResultInfo message(String message) {
        this.message = message;
        return this;
    }

    public ResultInfo total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 只返回状态，状态码，消息
     *
     * @param code
     * @param message
     */
    public ResultInfo(Integer code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    /**
     * 只返回状态，状态码，数据对象
     *
     * @param code
     * @param result
     */
    public ResultInfo(Integer code, Object result) {
        super();
        this.code = code;
        this.result = result;
    }

    /**
     * 返回全部信息即状态，状态码，消息，数据对象
     *
     * @param code
     * @param message
     * @param result
     */
    public ResultInfo(Integer code, String message, Object result) {
        super();
        this.code = code;
        this.message = message;
        this.result = result;
    }

}
