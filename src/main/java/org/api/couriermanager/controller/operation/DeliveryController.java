package org.api.couriermanager.controller.operation;

import org.api.couriermanager.entity.operation.Delivery;
import org.api.couriermanager.service.operation.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api.couriermanager/delivery")
@RestController
public class DeliveryController {

    @Autowired
    private IDeliveryService deliveryServiceService;

    @GetMapping
    public String welcome(){
        return "delivery options:\nread(id)\ncreate\nupdate\ndelete(id)";
    }

    @RequestMapping(value = "/read/{iD}", method = RequestMethod.GET)
    public Delivery read(@PathVariable String iD){
        return deliveryServiceService.read(iD);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Delivery create(@RequestBody Delivery h){

        return deliveryServiceService.create(h);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Delivery update(@RequestBody Delivery u, String id){

        return deliveryServiceService.update(u,id);
    }
/*
    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public Set<Delivery> getAll() {

        return helperService.getAll();
    }*/

    @RequestMapping(value = "/helper/{d}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String id){

        return deliveryServiceService.delete(id);
    }

}
