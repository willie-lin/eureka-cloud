package com.eureka.cloud.eurekafeignhystrixnode3.interfaces;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YuAn
 * @Package: com.eureka.cloud.eurekafeign.interfaces
 * @auther: YuAn
 * @Date: 2018/9/18
 * @Time: 19:59
 * @Project_name: eureka-cloud
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello world!";
    }
}
