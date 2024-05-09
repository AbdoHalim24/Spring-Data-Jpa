package com.AbdoHalim.SpringDataJpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
public class Teacher {
    @Id
    @SequenceGenerator(
            name = "teacher_id",
            sequenceName = "teacher_id",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "teacher_id",
            strategy = GenerationType.SEQUENCE
    )
    private Long teacherId;
    private  String  firstName;
    private  String LastName;


}
