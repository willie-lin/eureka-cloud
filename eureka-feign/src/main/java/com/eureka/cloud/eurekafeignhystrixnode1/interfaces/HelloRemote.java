package com.eureka.cloud.eurekafeignhystrixnode1.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YuAn
 * @Package: com.eureka.cloud.eurekafeign
 * @auther: YuAn
 * @Date: 2018/9/14
 * @Time: 18:05
 * @Project_name: eureka-cloud
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@Component
@FeignClient(name = "eureka-client", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}
