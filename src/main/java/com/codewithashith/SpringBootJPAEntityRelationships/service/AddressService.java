package com.codewithashith.SpringBootJPAEntityRelationships.service;

import com.codewithashith.SpringBootJPAEntityRelationships.model.Address;
import com.codewithashith.SpringBootJPAEntityRelationships.model.Teacher;
import com.codewithashith.SpringBootJPAEntityRelationships.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public Address save(Address address) {
        return addressRepository.save(address);
    }
}
