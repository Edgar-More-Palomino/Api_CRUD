package com.example.CRUD40min.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    private String firstName;

    private String lastName;

    @Column(name = "email_adrress", unique = true,nullable = false)
    private String email;

}
