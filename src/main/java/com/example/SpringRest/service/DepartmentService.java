package com.example.SpringRest.service;

import com.example.SpringRest.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;
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

    //Search operation
    Department searchDepartment(Department department,Long departmentId);

}