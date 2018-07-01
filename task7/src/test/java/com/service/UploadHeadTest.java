package com.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UploadHeadTest {
    @Autowired
    UploadHead uploadHead;

    @Autowired
    OSS oss;

    @Test
    public void uploadAndGetNametest() {
        //oss.uppictrue("default.png");
        uploadHead.UploadAndGetName("default.png");
        //System.out.println(name);
    }
}