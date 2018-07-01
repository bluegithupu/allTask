package com.controller;

import com.mapper.StudentMapper;
import com.pojo.Page;
import com.pojo.Student;
import com.service.PageStudent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PageController {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    PageStudent pageStudent;

    @RequestMapping("/page")
    public ModelAndView page(Page page){
        Logger logger = (Logger) LoggerFactory.getLogger(AddStudentController.class);
        logger.info("/page");
        //ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        //StudentMapper studentMapper = (StudentMapper) context.getBean("studentMapper");
        ModelAndView mav = new ModelAndView();
        //PageStudent pageStudent = new PageStudent();
        pageStudent.setStudentMapper(studentMapper);
        List<Student> cs = pageStudent.doSomeBusinessStuff(page);
        int total = pageStudent.getTotal();
        page.caculateLast(total);

        //放入转发参数
        mav.addObject("cs",cs);
        mav.setViewName("page");
        return mav;
    }

}
