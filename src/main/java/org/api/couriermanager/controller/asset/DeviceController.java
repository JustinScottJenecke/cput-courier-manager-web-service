package org.api.couriermanager.controller.asset;

import org.api.couriermanager.entity.asset.Device;
import org.api.couriermanager.service.asset.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/api.couriermanager/device")
public class DeviceController {

    @Autowired
    private IDeviceService deviceService;

    public String welcome(){
        return "driver options:";
    }


    @RequestMapping(value = "/read/{iD}", method = RequestMethod.GET)
    public Device read(@PathVariable String iD){
        return deviceService.read(iD);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Device create(@RequestBody Device h){

        return deviceService.create(h);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Device update(@RequestBody Device u, String id){

        return deviceService.update(u,id);
    }
/*
    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public Set<Helper> getAll() {

        return helperService.getAll();
    }*/

    @RequestMapping(value = "/delete/{d}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String id){

        return deviceService.delete(id);
    }
}
