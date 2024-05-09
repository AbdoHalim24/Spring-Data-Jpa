package com.AbdoHalim.SpringDataJpa.Repository;

import com.AbdoHalim.SpringDataJpa.entity.CourseMatirial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMatirialRepo extends JpaRepository<CourseMatirial,Long> {
}
