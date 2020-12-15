package org.example.service.asset.implementation;

import org.example.entity.asset.Vehicle;
import org.example.repository.asset.IVehicleRepository;
import org.example.service.asset.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;

public class VehicleService implements IVehicleService {

   // @Autowired
  //  IVehicleRepository vehicleRepository;

    @Override
    public Vehicle create(Vehicle x) {
        return null;
    }

    @Override
    public Vehicle read(String ID) {
        return null;
    }

    @Override
    public Vehicle update(Vehicle x, String ID) {
        return null;
    }

    @Override
    public boolean delete(String ID) {
        return false;
    }
}
