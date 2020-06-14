package com.santosh.integrationtest.service;

import com.santosh.integrationtest.model.ApplicationUser;

import java.util.Optional;

public interface UserService {

    Optional<ApplicationUser> findUserByUsername(String username);
}
