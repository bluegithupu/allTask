package com.service;


import com.model.Student;
import com.util.College;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CollegeTest {

    @Autowired
    College college;

    @Test
    public void getCollegeList() {
        List<Student> studentList = college.GetCollegeList();
        System.out.println(studentList);
        System.out.println(studentList.get(0));



    }
}