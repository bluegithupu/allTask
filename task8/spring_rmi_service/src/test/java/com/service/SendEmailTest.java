package com.service;

import com.util.SendEmail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SendEmailTest {

    @Autowired
    SendEmail sendEmail;

    @Test
    public void send_commonTest() throws Throwable {
        sendEmail.send_common("304584817@qq.com","niutao12","HSF6");
    }
}