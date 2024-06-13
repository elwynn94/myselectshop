package com.sparta.myselectshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  페이지 컨트롤러
 */

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }
}