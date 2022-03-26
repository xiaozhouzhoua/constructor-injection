package com.me.constructorinjection.controller;

import com.me.constructorinjection.repository.VideoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 *<img src="https://gitee.com/zhouguangping/image/raw/master/markdown/Xnip2022-03-27_00-24-05.jpg" alt="">
 */
@SpringBootTest
class VideoControllerTest {
    @MockBean
    private VideoRepository videoRepository;

    @Autowired
    private VideoController videoController;

    @Test
    public void contextLoads() {
        Assertions.assertNotNull(videoRepository);
        Assertions.assertNotNull(videoController);
    }
}