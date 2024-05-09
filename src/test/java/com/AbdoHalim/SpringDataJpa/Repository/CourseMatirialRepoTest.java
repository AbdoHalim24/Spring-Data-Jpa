package com.AbdoHalim.SpringDataJpa.Repository;

import com.AbdoHalim.SpringDataJpa.entity.Course;
import com.AbdoHalim.SpringDataJpa.entity.CourseMatirial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMatirialRepoTest {
    @Autowired
    private CourseMatirialRepo courseMatirialRepo;

    @Test
    public void saveCourse() {
        Course course = Course.builder()
                .titel("Spring")
                .cradit(5)
                .build();
        CourseMatirial courseMatirial = CourseMatirial.builder()
                .course(course)
                .url("www.spring.com")
                .build();
        courseMatirialRepo.save(courseMatirial);
    }
    @Test
    public  void retriveallcoursmatirial(){
        System.out.println("the courseMatirals are "+ courseMatirialRepo.findAll());
    }

}