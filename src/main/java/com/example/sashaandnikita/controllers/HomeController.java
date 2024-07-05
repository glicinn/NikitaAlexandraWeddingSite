package com.example.sashaandnikita.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/")
public class HomeController {

//    @GetMapping("/main")
//    public String mainIndex() {
//        return "main";
//    }

    @GetMapping("/index")
    public String indexIndex() {
        return "index";
    }

}