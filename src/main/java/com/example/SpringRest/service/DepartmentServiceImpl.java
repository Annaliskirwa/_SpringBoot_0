package com.example.SpringRest.service;

import com.example.SpringRest.entity.Department;
import com.example.SpringRest.repository.DepartmentRepository;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
}
