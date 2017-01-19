package com.simple.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * ProjectName: SpringBoot
 * Date: 2017/1/19
 * Time: 10:44
 *
 * @author wzpeng
 * @version v1.0
 */
@RestController
public class SimpleController {
    @GetMapping(value = {"hello", ""})
    public String hello() {
        return "Hello World";
    }
}
