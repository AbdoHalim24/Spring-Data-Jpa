package com.AbdoHalim.SpringDataJpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "course")
public class CourseMatirial {
    @Id
    @SequenceGenerator(
            name = "coursematirial-id",
            sequenceName = "coursematirial-id",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "coursematirial-id"
    )
    private  Long courseMatirialId;
    private  String url;

    @OneToOne(
            //when i save coureMatirail and course in the same time  use cascade
            //when the course in the database cascade not use
            cascade = CascadeType.ALL,
            //fetch->how you retrive the data with your table
            //LAZY->retrive only the table i want
            //EAGER->retrive the table and the table in the relation(course)
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    )
    private Course course;

}
