import com.cloopen.rest.sdk.CCPRestSmsSDK;
import com.service.SendShortMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Set;


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