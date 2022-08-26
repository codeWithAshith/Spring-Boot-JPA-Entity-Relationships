package com.codewithashith.SpringBootJPAEntityRelationships.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;

    @OneToOne(mappedBy = "address")
    private Teacher teacher;
}
