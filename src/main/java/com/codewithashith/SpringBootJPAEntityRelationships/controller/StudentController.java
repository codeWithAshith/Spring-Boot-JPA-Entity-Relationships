package com.codewithashith.SpringBootJPAEntityRelationships.controller;

import com.codewithashith.SpringBootJPAEntityRelationships.model.Student;
import com.codewithashith.SpringBootJPAEntityRelationships.repository.StudentRepository;
import com.codewithashith.SpringBootJPAEntityRelationships.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    List<Student> getStudents() {
        return studentService.findAll();
    }

    @PostMapping
    Student createStudent(@RequestBody Student student) {
        return studentService.save(student);
    }
}
