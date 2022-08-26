package com.codewithashith.SpringBootJPAEntityRelationships.controller;

import com.codewithashith.SpringBootJPAEntityRelationships.model.Student;
import com.codewithashith.SpringBootJPAEntityRelationships.model.Subject;
import com.codewithashith.SpringBootJPAEntityRelationships.model.Teacher;
import com.codewithashith.SpringBootJPAEntityRelationships.service.StudentService;
import com.codewithashith.SpringBootJPAEntityRelationships.service.SubjectService;
import com.codewithashith.SpringBootJPAEntityRelationships.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @GetMapping
    List<Subject> getSubjects() {
        return subjectService.findAll();
    }

    @PostMapping
    Subject createSubject(@RequestBody Subject subject) {
        return subjectService.save(subject);
    }

    @PutMapping("/{subjectId}/students/{studentId}")
    Subject addStudentToSubject(@PathVariable Long subjectId, @PathVariable Long studentId) {
        return subjectService.addStudentToSubject(subjectId, studentId);
    }

    @PutMapping("/{subjectId}/teacher/{teacherId}")
    Subject assignTeacherToSubject(@PathVariable Long subjectId, @PathVariable Long teacherId) {
        return subjectService.assignTeacherToSubject(subjectId, teacherId);

    }
}
