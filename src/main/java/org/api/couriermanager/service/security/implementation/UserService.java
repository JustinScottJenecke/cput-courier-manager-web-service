package org.api.couriermanager.service.security.implementation;

import org.api.couriermanager.entity.security.User;
import org.api.couriermanager.repository.security.UserRepository;
import org.api.couriermanager.service.security.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User create(User x) {
        return this.userRepository.save(x);
    }

    @Override
    public User read(String ID) {
        return this.userRepository.findById(ID).orElseGet(null);
        //return this.userRepository.getOne(Integer.valueOf(ID));
    }
    
    public List<User> readUsers(){
        return this.userRepository.findAll();
    }

    @Override
    public User update(User x, String ID) {
        if(this.userRepository.existsById(x.getUserID())){

            return this.userRepository.save(x);
        }
        return null;
    }

    @Override
    public boolean delete(String ID) {
        this.userRepository.deleteById(ID);

        if (this.userRepository.existsById(ID))
            return false;
        else
            return true;
    }

}
