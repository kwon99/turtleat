package com.kwon99.turtleat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
