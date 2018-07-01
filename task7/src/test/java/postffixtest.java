import com.service.UploadHead;
import org.junit.Test;

public class postffixtest {

    @Test
    public void ssssssss(){
        String[] postffix = "heheh.JSP".split("\\.");
        System.out.println(postffix);

        //
        String a = "heheh.JSP".substring(5,9);
        System.out.println(a);

        UploadHead uploadHead = new UploadHead();
        //String n = uploadHead.UploadAndGetName("qqq.JPG");
        //System.out.println(n);
    }
}
