package com.example.SpringRest.controller;

import com.example.SpringRest.entity.Department;
import com.example.SpringRest.service.DepartmentService;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    //Save operation
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    //Read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }

    //Update operation
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId) {
        return departmentService.updateDepartment(department, departmentId);
    }

    //Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "The department has been successfully deleted";
    }
    //search controller
    @GetMapping("/departments/{id}")
    public Optional<Department> findById(@PathVariable("id") Long departmentId)
    {
        Optional<Department> departmentList;
//        departmentList = departmentService.findById(departmentId);
//        return departmentList;
        return departmentService.findById(departmentId);
    }
}
