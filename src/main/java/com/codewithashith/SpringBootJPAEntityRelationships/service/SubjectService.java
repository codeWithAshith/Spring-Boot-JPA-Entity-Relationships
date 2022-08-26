package com.codewithashith.SpringBootJPAEntityRelationships.service;

import com.codewithashith.SpringBootJPAEntityRelationships.model.Student;
import com.codewithashith.SpringBootJPAEntityRelationships.model.Subject;
import com.codewithashith.SpringBootJPAEntityRelationships.model.Teacher;
import com.codewithashith.SpringBootJPAEntityRelationships.repository.StudentRepository;
import com.codewithashith.SpringBootJPAEntityRelationships.repository.SubjectRepository;
import com.codewithashith.SpringBootJPAEntityRelationships.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    public Subject addStudentToSubject(Long subjectId, Long studentId) {
        Subject subject = subjectRepository.findById(subjectId).get();
        Student student = studentRepository.findById(studentId).get();
        subject.getEnrolledStudents().add(student);
        return subjectRepository.save(subject);
    }

    public Subject assignTeacherToSubject(Long subjectId, Long teacherId) {
        Subject subject = subjectRepository.findById(subjectId).get();
        Teacher teacher = teacherRepository.findById(teacherId).get();
        subject.setTeacher(teacher);
        return subjectRepository.save(subject);
    }
}
