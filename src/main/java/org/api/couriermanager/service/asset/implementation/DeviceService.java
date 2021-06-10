package org.api.couriermanager.service.asset.implementation;

import org.api.couriermanager.entity.asset.Device;
import org.api.couriermanager.entity.security.User;
import org.api.couriermanager.repository.asset.IDeviceRepository;
import org.api.couriermanager.service.asset.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService implements IDeviceService {

    @Autowired
    IDeviceRepository deviceRepository;

    @Override
    public Device create(Device x) {
        return this.deviceRepository.save(x);
    }

    @Override
    public Device read(String ID) {
        return this.deviceRepository.findById(ID).orElseGet(null);
    }


    public List<Device> readAll(){
        return this.deviceRepository.findAll();
    }

    @Override
    public Device update(Device x, String ID) {

        if(this.deviceRepository.existsById(x.getDeviceID())){

            return this.deviceRepository.save(x);
        }
        return null;
    }

    @Override
    public boolean delete(String ID) {

        this.deviceRepository.deleteById(ID);
        if (this.deviceRepository.existsById(ID))
            return false;
        else
            return true;
    }
}
