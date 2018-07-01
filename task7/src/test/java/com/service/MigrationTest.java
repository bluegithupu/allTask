package com.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MigrationTest {

    @Autowired
    Migration migration;

//    @Test
//    public void doalitoqiniutest() {
//        Migration.doalitoqiniu();
//    }

//    @Test
//    public void doqiniutoalitest() throws IOException {
//        Migration.doqiniutoali();
//    }

//     @Test
//     public void dogetqiniulisttest(){
//         Migration.dogetqiniulist();
//     }

//      @Test
//      public void dogetalilisttest(){
//          Map<String,String> map = Migration.doGetAliNameUrl();
//          for (Map.Entry<String, String> entry : map.entrySet()) {
//              System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//          }
//      }
        @Test
        public void doalitoqiniutest() throws IOException {
            migration.doalitoqiniu();
        }
}