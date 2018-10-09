package com.eureka.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YuAn
 * @Package: com.eureka.cloud.configclient.controller
 * @auther: YuAn
 * @Date: 2018/9/29
 * @Time: 18:56
 * @Project_name: eureka-cloud
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@RestController
@RefreshScope
public class HelloController {

    @Value("${info.profile:error}")
        private String profile;

        @GetMapping("/info")
        public Mono<String> hello() {
            return Mono.justOrEmpty(profile);
    }

//    @Value("${info.profile:error}")
//    private String hello;
//
//    @RequestMapping("/hello")
//    public String from() {
//        return this.hello;
//    }
}
