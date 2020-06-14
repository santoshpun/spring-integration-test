package com.santosh.integrationtest;

import com.santosh.integrationtest.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Slf4j
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {
        TestRepoConfiguration.class,
        UserRepository.class
})
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        log.info("user repo : " + userRepository.findByUsername("admin"));
    }
}
