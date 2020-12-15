package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/couriermanager")
@RestController
public class HomeController {

    @RequestMapping("/home")
    String home(){
        return "Home";
    }

}
