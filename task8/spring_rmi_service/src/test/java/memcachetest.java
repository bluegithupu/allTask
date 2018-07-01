import com.mapper.StudentMapper;
import com.util.College;
import com.util.StringJson;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;
import java.util.concurrent.TimeoutException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class memcachetest {
    @Autowired
    MemcachedClient memcachedClient;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    College college;

//    @Test
//    public void gogogogog() throws IOException {
//        try {
//            Gson gson = new Gson();
//            Map<Integer, String> collegemap = getCollege.GetCollegeMap();
//            //map转json
//            String map = gson.toJson(collegemap);
//            memcachedClient.set("map",0,map);
//            String nn =  memcachedClient.get("map");
//            Type type = new TypeToken<Map<Integer, String>>() {}.getType();
//            Map<Integer, String> sss = gson.fromJson(nn,type);
//            String name0 = sss.get(0);
//            System.out.println(name0);
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (MemcachedException e) {
//            e.printStackTrace();
//        }finally {
//            memcachedClient.shutdown();
//        }
//    }

    @Test
    public void zzzzzz(){
        Map<Integer, String> collegemap = college.GetCollegeMap();
        StringJson stringJson = new StringJson();
        String json =  StringJson.MapToJson(collegemap);
        try {
            memcachedClient.set("fuck",0,json);
            String nn =  memcachedClient.get("fuck");
            Map<Integer, String> a = StringJson.JsonToMap(nn);
            System.out.println("到底行不行"+a.get(0));
            System.out.println("什么鬼"+memcachedClient.get("learnnum"));

        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (MemcachedException e) {
            e.printStackTrace();
        }


    }

}
