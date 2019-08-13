package com.loki.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Loki
 * @Date: 2019/8/13 19:02
 * @Project: Springboot101
 * @Description:使用sample作为第一个测试用例
 */

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello World!";
    }

    public static void main(String[] args) throws  Exception{
        SpringApplication.run(SampleController.class,args);
    }
}
