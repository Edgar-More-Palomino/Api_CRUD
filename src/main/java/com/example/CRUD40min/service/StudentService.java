package com.example.CRUD40min.service;

import com.example.CRUD40min.entity.Student;
import com.example.CRUD40min.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student>mostrarStudents(){
        return studentRepository.findAll();
    }
    public Optional<Student> mostrarStudent(Integer id){

        return studentRepository.findById(id);
    }
    public void guardarOactualizarStudent(Student student){
        studentRepository.save(student);
    }
    public void eliminarStudent(Integer id){
        studentRepository.deleteById(id);
    }



}
