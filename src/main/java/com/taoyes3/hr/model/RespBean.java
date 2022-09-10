package com.taoyes3.hr.model;

import lombok.Data;

/**
 * @author taoyes3
 * @date 2022/9/10 20:44
 */
@Data
public class RespBean {
    private Integer code;
    private String msg;
    private Object data;

    public static RespBean success(String msg) {
        return new RespBean(200, msg, null);
    }

    public static RespBean success(String msg, Object data) {
        return new RespBean(200, msg, data);
    }

    public static RespBean error(String msg) {
        return new RespBean(500, msg, null);
    }

    public static RespBean error(String msg, Object data) {
        return new RespBean(500, msg, data);
    }

    public RespBean(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
