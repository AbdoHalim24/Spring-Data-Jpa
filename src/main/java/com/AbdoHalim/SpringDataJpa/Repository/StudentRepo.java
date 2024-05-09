package com.AbdoHalim.SpringDataJpa.Repository;

import com.AbdoHalim.SpringDataJpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    List<Student> findByFirstName(String name);

    //jpql
    //based on the classes
    @Query("select  s from Student  s where s.id=?1")
    Student getStudentById(int id);

    //native based on the database

    @Query(
            value = "SELECT * FROM student  s where s.id=?1",
            nativeQuery = true
    )
    Student getStudentByidnative(int id);



}
