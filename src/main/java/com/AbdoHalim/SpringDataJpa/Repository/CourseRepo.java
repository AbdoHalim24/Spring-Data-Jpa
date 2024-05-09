package com.AbdoHalim.SpringDataJpa.Repository;

import com.AbdoHalim.SpringDataJpa.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {

}
