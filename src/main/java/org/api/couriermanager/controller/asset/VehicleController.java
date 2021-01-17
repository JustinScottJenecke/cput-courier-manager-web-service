package org.api.couriermanager.controller.asset;

import org.api.couriermanager.entity.asset.Vehicle;
import org.api.couriermanager.service.asset.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/api.couriermanager/vehicle")
public class VehicleController {

    @Autowired
    private IVehicleService vehicleService;

    public String welcome(){
        return "driver options:";
    }


    @RequestMapping(value = "/read/{iD}", method = RequestMethod.GET)
    public Vehicle read(@PathVariable String iD){
        return vehicleService.read(iD);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Vehicle create(@RequestBody Vehicle h){

        return vehicleService.create(h);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Vehicle update(@RequestBody Vehicle u, String id){

        return vehicleService.update(u,id);
    }
/*
    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public Set<Helper> getAll() {

        return helperService.getAll();
    }*/

    @RequestMapping(value = "/delete/{d}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String id){

        return vehicleService.delete(id);
    }
}
