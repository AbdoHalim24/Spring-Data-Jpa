package com.AbdoHalim.SpringDataJpa.Repository;

import com.AbdoHalim.SpringDataJpa.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseRepoTest {
    @Autowired
    private CourseRepo courseRepo;

    @Test
    public void retriveAllCourses(){
        System.out.println("the courses are" + courseRepo.findAll());
    }
    @Test
    public void savecourse(){
        Teacher teacher=Teacher.builder()
                .firstName("abdo")
                .LastName("halim")
                .build();
        Course course=Course.builder()
                .cradit(3)
                .titel("java")
                .build();
        courseRepo.save(course);

    }
    @Test
    public void retriveallCoursesinPages(){
        Pageable pageable = PageRequest.of(0,3);

        List<Course> courseList=courseRepo.findAll(pageable).getContent();
        System.out.println(courseList);


    }
    @Test
    public void saveoursewithstudent(){
        Teacher teacher=Teacher.builder()
                .LastName("halim")
                .LastName("ali")
                .build();
        Gurdian gurdian =Gurdian.builder()

                .gurdianEmail("abdohaim@gmail.com")
                .gurdianMobile("83838383")
                .gurdianName("masr")
                .build();
        Student student=Student.builder()
                .gurdian(gurdian)
                .lastName("ali")
                .firstName("mhmd")
                .emailId("20201700442@cis.asu.edu.eg")
                .build();
        Course course=Course.builder()
                .titel("asp.net")
                .cradit(23)
                .teacher(teacher)
                .studentList(List.of(student))
                .build();
        courseRepo.save(course);

    }





}