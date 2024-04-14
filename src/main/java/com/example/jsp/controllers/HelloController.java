package com.example.jsp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping( "/jsp")
public class HelloController {

    @GetMapping("/user/")
    public String helloJSP(Model model, @RequestParam(name = "name"
    ,required = false,defaultValue = "java spring")
                           String name) {
        model.addAttribute("name",name);
        return "hello";
    }

}
