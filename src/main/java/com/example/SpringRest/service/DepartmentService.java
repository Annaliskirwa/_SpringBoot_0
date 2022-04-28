package com.example.SpringRest.service;

import com.example.SpringRest.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DepartmentService {
    //save operation
    Department saveDepartment(Department department);

    //Read operation
    List<Department> fetchDepartmentList();

    //Update operation
    Department updateDepartment(Department department, Long departmentId);

    //Delete operation
    void deleteDepartmentById(Long departmentId);
    //search operation
    Optional<Department> findById(Long id);
}