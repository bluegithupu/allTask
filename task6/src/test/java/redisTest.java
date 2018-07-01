import com.service.GetCollege;
import com.service.GetCollegeStringMap;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import java.util.Map;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class redisTest {
    private static final String ipAddr = "127.0.0.1";
    private static final int port = 6379;
    private static  Jedis jedis = null;
    @Autowired
    GetCollegeStringMap getCollegeStringMap;
    @BeforeClass
    public static void  init(){
        jedis = new Jedis(ipAddr,port);
    }
    @Test
    public void aaaaa(){
        Map<String, String> collegemap = getCollegeStringMap.GetCollegeMap();
        //jedis.hmset("collegemap",collegemap);
        //System.out.println(jedis.hmget("collegemap","0"));
        System.out.println(jedis.hlen("co"));
    }

}
