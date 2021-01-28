package org.api.couriermanager.controller;

import org.api.couriermanager.entity.security.User;
import org.api.couriermanager.repository.security.UserRepository;
import org.api.couriermanager.service.security.implementation.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
