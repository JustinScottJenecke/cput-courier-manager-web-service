package org.example.service.employee.implementation;

import org.example.entity.employee.Helper;
import org.example.repository.employee.IHelperRepository;
import org.example.service.employee.IHelperService;
import org.springframework.beans.factory.annotation.Autowired;

public class HelperService implements IHelperService {

    @Autowired
    IHelperRepository helperRepository;

    @Override
    public Helper create(Helper x) {
        return this.helperRepository.save(x);
    }

    @Override
    public Helper read(String ID) {
        return this.helperRepository.findById(ID).orElseGet(null);
    }

    @Override
    public Helper update(Helper x, String ID) {

        if(this.helperRepository.existsById(x.getHelperID())){

            return this.helperRepository.save(x);
        }
        return null;
    }

    @Override
    public boolean delete(String ID) {

        this.helperRepository.deleteById(ID);
        if (this.helperRepository.existsById(ID))
            return false;
        else
            return true;
    }
}
