package com.example.SpringRest.service;

import com.example.SpringRest.entity.Department;
import com.example.SpringRest.repository.DepartmentRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    //Save operation
    @Override
    public Department saveDepartment(Department department)
    {
        return (Department) departmentRepository.save(department);
    }
    //Read operation
    @Override
    public List<Department> fetchDepartmentList()
    {
        return (List<Department>) departmentRepository.findAll();
    }
    //Update repository
    @Override
    public Department updateDepartment(Department department, Long departmentId)
    {
        Department depDB = (Department) departmentRepository.findById(departmentId).get();
        if (Objects.nonNull(department.getDepartmentName())
                && !"".equalsIgnoreCase(
                department.getDepartmentName())) {
            depDB.setDepartmentName(
                    department.getDepartmentName());
        }

        if (Objects.nonNull(
                department.getDepartmentAddress())
                && !"".equalsIgnoreCase(
                department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(
                    department.getDepartmentAddress());
        }

        if (Objects.nonNull(department.getDepartmentCode())
                && !"".equalsIgnoreCase(
                department.getDepartmentCode())) {
            depDB.setDepartmentCode(
                    department.getDepartmentCode());
        }
        return (Department) departmentRepository.save(depDB);
    }
    //Delete operation
    @Override
    public void deleteDepartmentById(Long departmentId)
    {
        departmentRepository.deleteById(departmentId);
    }
    //search operation
    public Optional<Department> findById(Long id)
    {
        return departmentRepository.findById(id);
    }
}

