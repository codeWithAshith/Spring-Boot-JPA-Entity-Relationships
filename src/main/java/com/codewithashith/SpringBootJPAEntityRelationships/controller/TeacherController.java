package com.codewithashith.SpringBootJPAEntityRelationships.controller;

import com.codewithashith.SpringBootJPAEntityRelationships.model.Address;
import com.codewithashith.SpringBootJPAEntityRelationships.model.Teacher;
import com.codewithashith.SpringBootJPAEntityRelationships.service.TeacherService;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping
    List<Teacher> getTeachers() {
        return teacherService.findAll();
    }

    @PostMapping
    Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.save(teacher);
    }

    @GetMapping("/address/{id}")
    Address getTeachersAddress(@PathVariable Long teacher_id) {
        return teacherService.findAddressByTeacherId(teacher_id);
    }

    @GetMapping("/{teacherId}/address/{addressId}")
    Teacher registerAddress(@PathVariable Long teacherId,@PathVariable Long addressId){
        return teacherService.registerAddress(teacherId,addressId);
    }
}