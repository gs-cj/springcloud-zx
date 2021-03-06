package com.jk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerFeignApplication.class, args);
        System.out.println("feign启动成功");
    }

}
