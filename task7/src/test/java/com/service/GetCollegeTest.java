package com.service;


import com.mapper.StudentMapper;
import com.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class GetCollegeTest {

    @Autowired
    GetCollege getCollege;

    @Test
    public void getCollegeList() {
        List<Student> studentList = getCollege.GetCollegeList();
        System.out.println(studentList);
        System.out.println(studentList.get(0));



    }
}