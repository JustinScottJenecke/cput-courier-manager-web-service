package org.example.service.employee.implementation;

import org.example.entity.employee.Driver;
import org.example.repository.employee.IDriverRepository;
import org.example.service.employee.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;

public class DriverService implements IDriverService {

    @Autowired
    IDriverRepository driverRepository;

    @Override
    public Driver create(Driver x) {
        return this.driverRepository.save(x);
    }

    @Override
    public Driver read(String ID) {
        return this.driverRepository.findById(ID).orElseGet(null);
    }

    @Override
    public Driver update(Driver x, String ID) {

        if(this.driverRepository.existsById(x.getDriverID())){

            return this.driverRepository.save(x);
        }
        return null;
    }

    @Override
    public boolean delete(String ID) {

        this.driverRepository.deleteById(ID);
        if (this.driverRepository.existsById(ID))
            return false;
        else
            return true;
    }
}
