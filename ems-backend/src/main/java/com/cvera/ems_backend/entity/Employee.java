package com.cvera.ems_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// lombok annotation to avoid boilerplate code
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity // ----to specify a class as a JPA Entity ----//the class will represent a table in a database, and each instance(obj) of the class will be a row in that table
@Table(name = "employees")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

}
