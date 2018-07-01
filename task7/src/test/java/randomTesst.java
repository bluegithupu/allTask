import org.junit.Test;

public class randomTesst {

    @Test
    public void randomss(){
//        首先，Math.random()取值范围是[0,1)
//        那么Math.random()*9000的取值范围是[0,9000);
//        那么Math.random()*9000+1000的取值范围是[1000,10000)。
//        注：中括号表示可以取到，而小括号表示不能取到！
        double s =  Math.random()*9000+1000;
        int p = (int)s;
        System.out.println(s);
//        String i =  String.valueOf(s);
//        System.out.println(i);
    }
}
