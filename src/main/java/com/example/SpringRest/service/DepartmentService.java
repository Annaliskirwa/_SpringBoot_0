package com.example.SpringRest.service;

import com.example.SpringRest.entity.Department;

import java.util.List;

public interface DepartmentService {
//save operation
    Department saveDepartment(Department department);

//    Read operation
    List<Department> fetchDepartmentList();

//    Update operation
    Department updateDepartment(Department department, Long departmentId);

//    Delete operation
    void deleteDepartmentById(Long departmentId);
}