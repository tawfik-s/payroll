package com.example.payroll.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeControllerTest {

    @Autowired
    private EmployeeController controller;

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }

}