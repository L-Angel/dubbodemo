package com.langel.dubbo.api;

import java.io.Serializable;

/**
 * @auther jiangcw@Ctrip.com(l-angel)
 * @date 2018/7/12
 **/
public interface AsyncCallBack<T> extends Serializable {

    void onComplete(T msg);
}
