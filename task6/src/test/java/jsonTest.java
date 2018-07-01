import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class jsonTest {
    @Test
    public void ssssss(){
        Gson gson = new Gson();
        Map<Integer,String> college = new HashMap<Integer, String>();
        college.put(0,"name0");
        college.put(1,"name1");
        String e = college.get(0);
        System.out.println(e);
        System.out.println(college.size());

        //傻逼一样的遍历。
        for(Map.Entry<Integer,String> s:college.entrySet()){
            System.out.println(s);
        }

        String g = gson.toJson(college);
        System.out.println(g);
        //呵呵
        Type type = new TypeToken<Map<Integer, String>>() {}.getType();
        Map<Integer,String> college1 = gson.fromJson(g,type);
        System.out.println(college1);
        System.out.println(college1.get(1));



    }
}
