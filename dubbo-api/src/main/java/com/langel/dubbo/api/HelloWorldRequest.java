package com.langel.dubbo.api;

import java.io.Serializable;

/**
 * @auther jiangcw@Ctrip.com(l-angel)
 * @date 2018/7/12
 **/
public class HelloWorldRequest implements Serializable {

    private String msg;

    public HelloWorldRequest(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
