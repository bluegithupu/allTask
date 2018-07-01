package com.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SendEmailTest {

    @Autowired
    SendEmail sendEmail;

    @Test
    public void send_common() {
        try {
            sendEmail.send_common("304584817@qq.com","niutao","1234");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}