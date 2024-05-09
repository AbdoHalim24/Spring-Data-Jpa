package com.AbdoHalim.SpringDataJpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    @Id
    @SequenceGenerator(
            name = "course_id",
            sequenceName = "course_id",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_id"
    )
    private  Long courseId;
    private int cradit;
    private String titel;

    @OneToOne(
            mappedBy = "course"
    )
    private CourseMatirial courseMatirial;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "teacherId",
            referencedColumnName = "teacherId"
    )
    private  Teacher teacher;

    @ManyToMany( cascade =  CascadeType.ALL)
    @JoinTable(
            name = "course-studnet-tbl",
            joinColumns = @JoinColumn(
                    name = "course_id",
                    referencedColumnName = "courseId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "studentid",
                    referencedColumnName = "studentid"
            )
    )
    private  List<Student> studentList;

}
