package com.codewithashith.SpringBootJPAEntityRelationships.service;

import com.codewithashith.SpringBootJPAEntityRelationships.model.Address;
import com.codewithashith.SpringBootJPAEntityRelationships.model.Teacher;
import com.codewithashith.SpringBootJPAEntityRelationships.repository.AddressRepository;
import com.codewithashith.SpringBootJPAEntityRelationships.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private AddressRepository addressRepository;

    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Address findAddressByTeacherId(long teacherId) {
        Teacher teacher = teacherRepository.findById(teacherId).get();
        return teacher.getAddress();
    }

    public Teacher registerAddress(Long teacherId, Long addressId) {
        Teacher teacher = teacherRepository.findById(teacherId).get();
        Address address = addressRepository.findById(addressId).get();
        teacher.setAddress(address);
        return teacherRepository.save(teacher);
    }
}
