package org.api.couriermanager.controller.asset;

import org.api.couriermanager.entity.asset.Device;
import org.api.couriermanager.service.asset.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RequestMapping("/api.couriermanager/device")
@RestController
public class DeviceController {

    @Autowired
    private IDeviceService deviceService;

    @GetMapping
    public String welcome(){
        return "device options:\nread(id)\ncreate\nupdate\ndelete(id)";
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

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Device> readAll() {
        return this.deviceService.readAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String id) {

        return deviceService.delete(id);
    }
}
