package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenyue7@foxmail.com
 * @date 2021/2/15
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class GatewayApplication9527 {
    public static void main(String[] args){
        SpringApplication.run(GatewayApplication9527.class, args);
    }
}
