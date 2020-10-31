package com.springboot.docker.springbootdocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangzheng
 * @version 1.0
 * @description
 * @date 2020/10/31 031 13:54
 */
@RestController
public class DockerController {

    @RequestMapping("/docker")
    public String test() {
        return "docker1";
    }
}
