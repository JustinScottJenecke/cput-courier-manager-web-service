package org.example.service.asset.implementation;

import org.example.entity.asset.Device;
import org.example.repository.asset.IDeviceRepository;
import org.example.service.asset.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;

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
