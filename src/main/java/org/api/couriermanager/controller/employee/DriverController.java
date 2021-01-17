package org.api.couriermanager.controller.employee;

import org.api.couriermanager.entity.employee.Driver;
import org.api.couriermanager.service.employee.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/api.couriermanager/driver")
public class DriverController {

    @Autowired
    private IDriverService driverService;

    public String welcome(){
        return "driver options:";
    }


    @RequestMapping(value = "/read/{iD}", method = RequestMethod.GET)
    public Driver read(@PathVariable String iD){
        return driverService.read(iD);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Driver create(@RequestBody Driver h){

        return driverService.create(h);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Driver update(@RequestBody Driver u, String id){

        return driverService.update(u,id);
    }
/*
    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public Set<Helper> getAll() {

        return helperService.getAll();
    }*/

    @RequestMapping(value = "/delete/{d}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String id){

        return driverService.delete(id);
    }
}
