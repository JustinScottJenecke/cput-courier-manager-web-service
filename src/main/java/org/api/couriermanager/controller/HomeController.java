package org.api.couriermanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api.couriermanager")
@RestController
public class HomeController {

    @RequestMapping("/home")
    String home(){
        return "Home";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String tester() { return "test worked"; }

}
