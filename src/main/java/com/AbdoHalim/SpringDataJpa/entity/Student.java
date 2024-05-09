package com.AbdoHalim.SpringDataJpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @SequenceGenerator(
            name = "student-squence",
            sequenceName = "student-squence",
            allocationSize = 1

    )
    @GeneratedValue(
             strategy = GenerationType.SEQUENCE,
            generator = "student-squence"
    )
    private  Long studentid;

    private  String firstName;
    private String lastName;

   @Column(
           name = "Email_address",
           nullable = false
   )
    private String emailId;
   @Embedded
    private Gurdian gurdian;



}
