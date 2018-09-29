package com.eureka.cloud.eurekafeignhystrixnode3.controller;

import com.eureka.cloud.eurekafeignhystrixnode3.interfaces.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YuAn
 * @Package com.eureka.cloud.eurekafeign.controller
 * @auther  YuAn
 * @Date 2018/9/14
 * @Time 18:14
 * @Project_name: eureka-cloud
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    public HelloRemote getHelloRemote() {
        return helloRemote;
    }

    public void setHelloRemote(HelloRemote helloRemote) {
        this.helloRemote = helloRemote;
    }


    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name){
        return helloRemote.hello(name + "!!!");
    }
}
