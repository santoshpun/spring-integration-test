package com.santosh.integrationtest;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.nio.charset.StandardCharsets;

@Slf4j
@SpringBootTest
@Transactional
public class AbstractTest {

    protected byte[] toJson(Object r) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(r).getBytes(StandardCharsets.UTF_8);
    }

    @BeforeAll
    public static void start() {
        log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @AfterAll
    public static void end() {
        log.info("----------------------------------------------------------");
    }
}
