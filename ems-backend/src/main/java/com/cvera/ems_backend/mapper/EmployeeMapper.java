package com.cvera.ems_backend.mapper;


import com.cvera.ems_backend.dto.EmployeeDto;
import com.cvera.ems_backend.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){ // get the values from Employee Entity and set them to EmployeeDto
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    //Mapping EmployeeDto to Employee Entity
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }

}
