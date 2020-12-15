package org.example.controller.employee;

import org.example.entity.employee.Helper;
import org.example.service.employee.IHelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Set;

@RequestMapping("/couriermanager/helper")
public class HelperController {

    @Autowired
    private IHelperService helperService;

    public String welcome(){
        return "helper options";
    }


    @RequestMapping(value = "/read/{iD}", method = RequestMethod.GET)
    public Helper read(@PathVariable String iD){
        return helperService.read(iD);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Helper create(@RequestBody Helper h){

        return helperService.create(h);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Helper update(@RequestBody Helper u, String id){

        return helperService.update(u,id);
    }
/*
    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public Set<Helper> getAll() {

        return helperService.getAll();
    }*/

    @RequestMapping(value = "/helper/{d}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String id){

        return helperService.delete(id);
    }

}
