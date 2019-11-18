package com.zking.mybatis01.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 服务器返回给客户端的JSON格式的数据
 */
public class DataProtocol extends HashMap<String, Object> {

    public static int SUCCESS = 1;

    public static int FAIL = -1;

    private long ts = System.currentTimeMillis();

    public DataProtocol() {
        super();
        this.put("code", SUCCESS);
        this.put("ts", ts);
    }

    public void setCode(int code) {
        this.put("code", code);
    }

    public void setData(Object data) {
        this.put("data", data);
    }

    public void setErrors(Map<String,String> errors) {
        this.put("errros", errors);
    }

    public void setMessage(String message) {
        this.put("message", message);
    }

}
