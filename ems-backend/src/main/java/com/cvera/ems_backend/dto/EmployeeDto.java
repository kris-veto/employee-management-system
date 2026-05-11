package com.cvera.ems_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Data Transfer Obj
//The main purpose of a DTO is to decouple the layers of the system.

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}