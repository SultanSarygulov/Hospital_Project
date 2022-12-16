package com.hospital.Final_project.user;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {
    User save(User user);

    User findByEmail(String email);

//    User findById(Long id);
}
