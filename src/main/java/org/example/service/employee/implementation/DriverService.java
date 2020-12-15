package org.example.service.employee.implementation;

import org.example.entity.employee.Driver;
import org.example.repository.employee.IDriverRepository;
import org.example.service.employee.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;

public class DriverService implements IDriverService {

   // @Autowired
   // IDriverRepository driverRepository;

    @Override
    public Driver create(Driver x) {
        return null;
    }

    @Override
    public Driver read(String ID) {
        return null;
    }

    @Override
    public Driver update(Driver x, String ID) {
        return null;
    }

    @Override
    public boolean delete(String ID) {
        return false;
    }
}
