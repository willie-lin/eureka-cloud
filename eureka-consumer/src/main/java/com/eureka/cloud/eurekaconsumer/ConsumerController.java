package com.eureka.cloud.eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YuAn
 * @Package: com.eureka.cloud.eurekaconsumer
 * @auther: YuAn
 * @Date: 2018/9/14
 * @Time: 16:57
 * @Project_name: eureka-cloud
 * To change this template use File | Settings | File Templates.
 * @Description:
 */
@RestController
public class ConsumerController {


//    @Autowired

    private RestTemplate restTemplate;

    @Autowired
    public ConsumerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        name += "!";
//        String url = "http://eureka-producer/hello/?name=" + name;
        String url = "http://eureka-client/hello/?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }
}
