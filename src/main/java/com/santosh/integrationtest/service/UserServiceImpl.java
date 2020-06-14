package com.santosh.integrationtest.service;

import com.santosh.integrationtest.model.ApplicationUser;
import com.santosh.integrationtest.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository applicationUserRepository;

    @Override
    public Optional<ApplicationUser> findUserByUsername(String username) {
        return applicationUserRepository.findByUsername(username);
    }
}
