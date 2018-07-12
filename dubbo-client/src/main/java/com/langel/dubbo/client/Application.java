package com.langel.dubbo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @auther jiangcw@Ctrip.com(l-angel)
 * @date 2018/7/12
 **/
@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo-consumer.xml"})
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        System.setProperty("ccom.langel.dubbo.api.DubboDemoService", "dubbo://localhost:20881?helloWorldAsyncCallback.1.callback=true&helloWorldStreaming.1.callback=true");
        SpringApplication.run(Application.class,args);
    }
}
