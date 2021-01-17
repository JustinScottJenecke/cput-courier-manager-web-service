package org.api.couriermanager.service.security;

import org.api.couriermanager.entity.security.ApplicationUserDetails;
import org.api.couriermanager.repository.security.UserRepository;
import org.api.couriermanager.entity.security.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

       Optional<User> user = userRepository.findByUserName(userName);

       user.orElseThrow(() -> new UsernameNotFoundException("Not found " + userName));

       return user.map(ApplicationUserDetails::new).get();

    }
}
