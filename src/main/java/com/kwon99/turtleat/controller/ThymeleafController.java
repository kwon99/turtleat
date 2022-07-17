package com.kwon99.turtleat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

}


