package com.santosh.integrationtest;

import com.santosh.integrationtest.model.ApplicationUser;
import com.santosh.integrationtest.repository.UserRepository;
import com.santosh.integrationtest.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;

import java.util.Optional;

@Slf4j
@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes = {
})
public class UserServiceTest {
    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;

    @Test
    public void test() {
        ApplicationUser applicationUser = new ApplicationUser();
        applicationUser.setId(1l);

        Mockito.when(userRepository.findByUsername("admin")).thenReturn(Optional.of(applicationUser));

        MatcherAssert.assertThat(userService.findUserByUsername("admin"), CoreMatchers.notNullValue());
    }
}
