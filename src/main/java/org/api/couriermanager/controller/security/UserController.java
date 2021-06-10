package org.api.couriermanager.controller.security;

import org.api.couriermanager.entity.security.User;
import org.api.couriermanager.factory.security.UserFactory;
import org.api.couriermanager.service.security.implementation.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/api.couriermanager/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /*@GetMapping
    public List<User> greet(){
        return Arrays.asList("Hello", "World");
    }*/
    @GetMapping
    public String welcome(){
        return "user options:\nread(id)\nall\ncreate\nupdate\ndelete(id)";
    }
    @RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
    public User read(@PathVariable String id) {
        return userService.read(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAll() {
        return userService.readUsers();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User create(@RequestBody User h){

        return userService.create(h);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String id){

        return userService.delete(id);
    }

}
