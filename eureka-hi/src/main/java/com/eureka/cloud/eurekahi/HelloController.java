package com.eureka.cloud.eurekahi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.eureka.cloud.eurekahi
 * @auther: YuAn
 * @Date: 2018/9/13
 * @Time: 22:16
 * @Project_name: eureka-cloud
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/")
    public String hello(@RequestParam String name) {
        return "Hello, " + name + " " + new Date();
    }

}
