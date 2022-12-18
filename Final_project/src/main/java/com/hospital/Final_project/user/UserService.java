package com.hospital.Final_project.user;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {
    User save(UserDTO userDTO);

    User saveInfo(User user);

    User findByEmail(String email);

//    User findById(Long id);
}
