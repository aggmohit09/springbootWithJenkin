package com.learning.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringConctroller {

    @RequestMapping("")
    public String Test() {
        return "Test here!";
    }
}
