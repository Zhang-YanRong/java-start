package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.result.CommonResult;


@RestController
public class IndexController {


    @RequestMapping("/")
    public CommonResult index() {
        String data = "yes";
        return CommonResult.success(data);
    }
}

