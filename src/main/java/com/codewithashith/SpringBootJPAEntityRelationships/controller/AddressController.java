package com.codewithashith.SpringBootJPAEntityRelationships.controller;

import com.codewithashith.SpringBootJPAEntityRelationships.model.Address;
import com.codewithashith.SpringBootJPAEntityRelationships.model.Teacher;
import com.codewithashith.SpringBootJPAEntityRelationships.service.AddressService;
import com.codewithashith.SpringBootJPAEntityRelationships.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping
    List<Address> getAddress() {
        return addressService.findAll();
    }

    @PostMapping
    Address createAddress(@RequestBody Address address) {
        return addressService.save(address);
    }

}