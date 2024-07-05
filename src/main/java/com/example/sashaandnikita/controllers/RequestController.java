package com.example.sashaandnikita.controllers;

import com.example.sashaandnikita.models.Request;
import com.example.sashaandnikita.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/requests")
public class RequestController {

    private final RequestService requestService;

    @Autowired
    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }



    @GetMapping
    public String findAll(Model model) {
        List<Request> requests = requestService.findAll();
        model.addAttribute("requests", requests);
        return "request-list";
    }


    @GetMapping("/create")
//    public String createRequestForm(Request request) {
//        return "request-create";
//    }
    public String createRequestForm(Request request) {
        return "main";
    }

    @PostMapping("/create")
    public String createRequest(Request request) {
        requestService.saveRequest(request);
        return "redirect:/requests/create";
    }


    @GetMapping("/update/{id}")
    public String updateRequestForm(@PathVariable Long id, Model model) {
        Request request = requestService.findById(id);
        model.addAttribute("request", request);
        return "request-update";
    }


    @PostMapping("/update")
    public String updateRequest(Request request) {
        requestService.saveRequest(request);
        return "redirect:/requests";
    }


    @GetMapping("/delete/{id}")
    public String deleteRequest(@PathVariable Long id) {
        requestService.deleteById(id);
        return "redirect:/requests";
    }
}

