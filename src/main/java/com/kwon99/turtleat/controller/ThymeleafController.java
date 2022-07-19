package com.kwon99.turtleat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import com.kwon99.turtleat.service.Test;

@Controller
public class ThymeleafController {

    // index
    @GetMapping("/")
    public String index() {
        return "map";
    }

    // map
    @GetMapping("/map")
    public String map() {
        return "map";
    }


    @GetMapping("/test")
    public String test(Test test, Model model) {
        System.out.println(test.getValue());
        return "test";
    }

    // register
    @GetMapping("/register")
    public String register() {
        return "register";
    }

}
