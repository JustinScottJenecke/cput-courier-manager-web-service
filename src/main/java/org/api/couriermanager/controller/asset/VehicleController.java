package org.api.couriermanager.controller.asset;

import org.api.couriermanager.entity.asset.Vehicle;
import org.api.couriermanager.service.asset.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api.couriermanager/vehicle")
@RestController
public class VehicleController {

    @Autowired
    private IVehicleService vehicleService;

    @GetMapping
    public String welcome(){
        return "vehicle options:\nread(id)\ncreate\nupdate\ndelete(id)";
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

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String id){

        return vehicleService.delete(id);
    }
}
