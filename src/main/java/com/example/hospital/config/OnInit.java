package com.example.hospital.config;


import com.example.hospital.jpa.UserRepository;
import com.example.hospital.model.Sex;
import com.example.hospital.model.User;
import com.example.hospital.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;

@Component
public class OnInit {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    @Transactional
    public void afterBoot() {

        Optional<User> userOptional = userRepository.findByUsername("admin");

        if (!userOptional.isPresent()) {
            User user = new User();

            user.setUserRole(UserRole.Admin);
            user.setUsername("admin");
            user.setAccountValid(true);
            user.setSex(Sex.FEMALE);
            user.setFirstName("Julia");
            user.setLastName("Peicheva");
            user.setPassword(passwordEncoder.encode("123456"));
            user.setBirthDate(LocalDate.of(1956, Month.MAY, 13));
            userRepository.save(user);
        }

    }

}
