package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenyue7@foxmail.com
 * @date 2021/2/15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigApplication3377 {
    public static void main(String[] args){
        SpringApplication.run(NacosConfigApplication3377.class, args);
    }
}
