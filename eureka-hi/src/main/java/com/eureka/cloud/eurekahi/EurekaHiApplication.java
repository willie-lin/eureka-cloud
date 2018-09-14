package com.eureka.cloud.eurekahi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YuAn
 */
@SpringBootApplication
public class EurekaHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHiApplication.class, args);
    }

//    @Value("${server.port}")
//    String port;
//    @RequestMapping("/hi")
//    public String home(@RequestParam String name) {
//        return "hi "+name+",i am from port:" +port;
//    }

}
