package com.santosh.integrationtest;

import com.santosh.integrationtest.service.ProductService;
import com.santosh.integrationtest.service.ProductServiceImpl;
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
        ProductServiceImpl.class
})
public class ProductServiceTest {
    @Autowired
    private ProductService productService;

    @Test
    public void test() {
        log.info("product service : " + productService.findAllProducts());
    }
}
