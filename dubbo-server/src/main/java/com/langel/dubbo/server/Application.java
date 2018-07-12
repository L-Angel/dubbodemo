package com.langel.dubbo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @auther jiangcw@Ctrip.com(l-angel)
 * @date 2018/7/12
 **/
@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo-provider.xml"})
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
