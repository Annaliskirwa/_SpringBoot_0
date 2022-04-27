package com.example.SpringRest.controller;

import com.example.SpringRest.entity.Department;
import com.example.SpringRest.service.DepartmentService;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {
    @Autowired private DepartmentService departmentService;

    //Save operation
    @PostMapping("/departments")
    public Department saveDepartment(
            @Valid @RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }

    //Read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }


}
