package org.example.service.asset.implementation;


import org.example.entity.asset.Vehicle;
import org.example.repository.asset.IVehicleRepository;
import org.example.service.asset.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;

public class VehicleService implements IVehicleService {

    @Autowired
    IVehicleRepository vehicleRepository;

    @Override
    public Vehicle create(Vehicle x) {
        return this.vehicleRepository.save(x);
    }

    @Override
    public Vehicle read(String ID) {
        return this.vehicleRepository.findById(ID).orElseGet(null);
    }

    @Override
    public Vehicle update(Vehicle x, String ID) {

        if(this.vehicleRepository.existsById(x.getVehicleID())){

            return this.vehicleRepository.save(x);
        }
        return null;
    }

    @Override
    public boolean delete(String ID) {

        this.vehicleRepository.deleteById(ID);
        if (this.vehicleRepository.existsById(ID))
            return false;
        else
            return true;
    }
}
