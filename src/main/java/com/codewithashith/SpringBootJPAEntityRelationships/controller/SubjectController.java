package com.codewithashith.SpringBootJPAEntityRelationships.controller;

import com.codewithashith.SpringBootJPAEntityRelationships.model.Subject;
import com.codewithashith.SpringBootJPAEntityRelationships.service.SubjectService;
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

    @PutMapping("/{subjectId}/teacher/{teacherId}")
    Subject assignTeacherToSubject(@PathVariable Long subjectId, @PathVariable Long teacherId) {
        return subjectService.assignTeacherToSubject(subjectId, teacherId);

    }
}
