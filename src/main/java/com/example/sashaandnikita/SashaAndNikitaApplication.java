package com.example.sashaandnikita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@Controller
public class SashaAndNikitaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SashaAndNikitaApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/requests/create";
    }
}
