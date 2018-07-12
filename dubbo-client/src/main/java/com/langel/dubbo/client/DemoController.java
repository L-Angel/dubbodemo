package com.langel.dubbo.client;

import com.langel.dubbo.api.AsyncCallBack;
import com.langel.dubbo.api.DubboDemoService;
import com.langel.dubbo.api.HelloWordReponse;
import com.langel.dubbo.api.HelloWorldRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther jiangcw@Ctrip.com(l-angel)
 * @date 2018/7/12
 **/
@RestController
public class DemoController {

    private DubboDemoService dubboDemoService;

    @Autowired
    public DemoController(DubboDemoService demoService) {
        this.dubboDemoService = demoService;
    }

    @GetMapping("/hello")
    public Object hello() {

        /*dubboDemoService.hello(new HelloWorldRequest("Dubbo Demo Request"), new AsyncCallBack<HelloWordReponse>() {
            @Override
            public void onComplete(HelloWordReponse msg) {
                System.out.println(msg.getMsg());
            }
        });*/
        dubboDemoService.hello(new HelloWorldRequest("Dubbo Demo Request"), new AsyncCallbackImpl());
        return "Success";
    }
}
