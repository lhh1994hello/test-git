package com.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lihonghui
 * @date : 2021/3/10 10:33
 * @Description :
 **/
@RestController
public class HomeController {

    @GetMapping(value = "/test")
    public String test() {
        return "test测试";
    }
}
