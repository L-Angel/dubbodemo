package com.langel.dubbo.server;

import com.langel.dubbo.api.AsyncCallBack;
import com.langel.dubbo.api.DubboDemoService;
import com.langel.dubbo.api.HelloWordReponse;
import com.langel.dubbo.api.HelloWorldRequest;

import java.util.Date;

/**
 * @auther jiangcw@Ctrip.com(l-angel)
 * @date 2018/7/12
 **/
public class DubboDemoServiceImpl implements DubboDemoService {

    @Override
    public void hello(HelloWorldRequest request, AsyncCallBack<HelloWordReponse> callBack) {
        System.out.println(request == null ? null : request.getMsg());
        callBack.onComplete(new HelloWordReponse("Dubbo Callback Msg.\nDateTime : " + new Date()));
    }
}
