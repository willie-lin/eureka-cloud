package com.eureka.cloud.eurekafeignhystrixnode3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class EurekaFeignHystrixNode3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignHystrixNode3Application.class, args);
    }
}
