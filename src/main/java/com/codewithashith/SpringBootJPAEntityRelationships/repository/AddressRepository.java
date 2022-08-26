package com.codewithashith.SpringBootJPAEntityRelationships.repository;

import com.codewithashith.SpringBootJPAEntityRelationships.model.Address;
import com.codewithashith.SpringBootJPAEntityRelationships.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
