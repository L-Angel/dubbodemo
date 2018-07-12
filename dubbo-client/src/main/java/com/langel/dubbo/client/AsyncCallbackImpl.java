package com.langel.dubbo.client;

import com.langel.dubbo.api.AsyncCallBack;
import com.langel.dubbo.api.HelloWordReponse;

/**
 * @auther jiangcw@Ctrip.com(l-angel)
 * @date 2018/7/12
 **/
public class AsyncCallbackImpl implements AsyncCallBack<HelloWordReponse> {
    @Override
    public void onComplete(HelloWordReponse msg) {
        System.out.println(msg.getMsg());
    }
}
