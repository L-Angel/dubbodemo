package com.langel.dubbo.api;

/**
 * @auther jiangcw@Ctrip.com(l-angel)
 * @date 2018/7/12
 **/
public interface DubboDemoService {

    void hello(HelloWorldRequest request,AsyncCallBack<HelloWordReponse> callBack);
}
