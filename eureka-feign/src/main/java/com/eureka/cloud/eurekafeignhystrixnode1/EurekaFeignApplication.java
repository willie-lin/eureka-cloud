package com.eureka.cloud.eurekafeignhystrixnode1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author YuAn
 */

@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class EurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignApplication.class, args);
    }

}
