package org.api.couriermanager.controller.employee;

import org.api.couriermanager.entity.employee.Driver;
import org.api.couriermanager.service.employee.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api.couriermanager/driver")
@RestController
public class DriverController {

    @Autowired
    private IDriverService driverService;

    @GetMapping
    public String welcome(){
        return "driver options:\nread(id)\ncreate\nupdate\ndelete(id)";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "drivers service login test";
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
