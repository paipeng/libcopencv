package com.paipeng.libcopencv;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class COpenCVAPITest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testAdd() {
        int sum = COpenCVAPI.getInstance().add(1, 2);
        System.out.println("testAdd: " + sum);
        Assertions.assertEquals(sum, 3);
    }
}