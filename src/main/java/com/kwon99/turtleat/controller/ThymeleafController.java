package com.kwon99.turtleat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/view")
    public String view() {
        return "view";
    }

    @GetMapping("/map")
    public String map() {
        return "map";
    }

}
