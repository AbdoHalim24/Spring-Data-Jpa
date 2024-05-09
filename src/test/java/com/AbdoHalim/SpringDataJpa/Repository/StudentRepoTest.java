package com.AbdoHalim.SpringDataJpa.Repository;

import com.AbdoHalim.SpringDataJpa.entity.Gurdian;
import com.AbdoHalim.SpringDataJpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepoTest {

    private  StudentRepo studentRepo;

    @Autowired
    public StudentRepoTest(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    @Test
    public void saveuser(){
        Gurdian gurdian=Gurdian.builder()
                .gurdianEmail("halm@gmail")
                .gurdianName("araf")
                .gurdianMobile("00000")
                .build();
        Student student= Student.builder()
                .emailId("abdo@gmail.com")
                .firstName("abdo")
                .lastName("halim")
                .gurdian(gurdian)
                .build();
        studentRepo.save(student);
    }
    @Test
    public  void findall(){
        System.out.println(studentRepo.findByFirstName("abdo"));

    }
    @Test
    public void getStudentbyid(){
        System.out.println(studentRepo.getStudentById(1));
    }
    @Test
    public void getStudentbyidnative(){
        System.out.println(studentRepo.getStudentByidnative(1));
    }

}