package com.codewithashith.SpringBootJPAEntityRelationships.repository;

import com.codewithashith.SpringBootJPAEntityRelationships.model.Student;
import com.codewithashith.SpringBootJPAEntityRelationships.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
