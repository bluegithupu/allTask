package com.util;

import com.util.SendShortMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class shortmessageTest {
    @Autowired
    SendShortMessage sendShortMessage;

    @Test
    public void beansend(){
        sendShortMessage.SDKTestSendTemplateSMS("3864");
    }
}