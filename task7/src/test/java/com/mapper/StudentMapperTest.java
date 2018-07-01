package com.mapper;

import com.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentMapperTest {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    Student student;

    @Test
    public void selectByUnique() {
        student.setPhoneNumber("1353803932");
        int i = studentMapper.selectByUnique(student);
        System.out.println(i);
    }
}