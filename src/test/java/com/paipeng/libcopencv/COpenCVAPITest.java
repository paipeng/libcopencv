package com.paipeng.libcopencv;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class COpenCVAPITest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        int sum = COpenCVAPI.getInstance().add(1, 2);
        System.out.println("testAdd: " + sum);
        Assertions.assertEquals(sum, 3);
    }

    @Test
    void invertImage() throws IOException {
        BufferedImage bufferedImage = ImageUtil.readBufferedImage("/Users/paipeng/Downloads/9038f6f0-e1bc-4f5d-87cf-165eef4f3a0d.bmp");
        bufferedImage = COpenCVAPI.getInstance().invertImage(bufferedImage);
        Assertions.assertNotNull(bufferedImage);
        boolean ret = ImageUtil.saveBufferedImage(bufferedImage, "/Users/paipeng/Downloads/invert_image.bmp");
        Assertions.assertTrue(ret);
    }
}