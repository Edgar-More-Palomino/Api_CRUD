package com.example.CRUD40min.repository;

import com.example.CRUD40min.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
