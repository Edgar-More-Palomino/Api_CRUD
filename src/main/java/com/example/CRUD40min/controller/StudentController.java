package com.example.CRUD40min.controller;

import com.example.CRUD40min.entity.Student;
import com.example.CRUD40min.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student>mostrarStudents(){
        return studentService.mostrarStudents();
    }

    @GetMapping("/{studentId}")
    public Optional<Student> mostrarStudent(@PathVariable("studentId") Integer studentId){
        return studentService.mostrarStudent(studentId);
    }

    @PostMapping
    public void guardarOactualizarStudent(@RequestBody Student student){
        studentService.guardarOactualizarStudent(student);
    }

    @DeleteMapping("/{studentId}")
    public void eliminarStudent(@PathVariable("studentId") Integer studentId){
        studentService.eliminarStudent(studentId);
    }
}
