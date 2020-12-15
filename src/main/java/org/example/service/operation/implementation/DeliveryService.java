package org.example.service.operation.implementation;

import org.example.entity.operation.Delivery;
import org.example.repository.operation.IDeliveryRepository;
import org.example.service.operation.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;

public class DeliveryService implements IDeliveryService {

    @Autowired
    IDeliveryRepository deliveryRepository;

    @Override
    public Delivery create(Delivery x) {
        return this.deliveryRepository.save(x);
    }

    @Override
    public Delivery read(String ID) {
        return this.deliveryRepository.findById(ID).orElseGet(null);
    }

    @Override
    public Delivery update(Delivery x, String ID) {

        if(this.deliveryRepository.existsById(x.getDeliveryNo())){

            return this.deliveryRepository.save(x);
        }
        return null;
    }

    @Override
    public boolean delete(String ID) {

        this.deliveryRepository.deleteById(ID);
        if (this.deliveryRepository.existsById(ID))
            return false;
        else
            return true;
    }
}
