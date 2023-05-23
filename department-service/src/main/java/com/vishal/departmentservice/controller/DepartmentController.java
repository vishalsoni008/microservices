package com.vishal.departmentservice.controller;

import com.vishal.departmentservice.domain.Department;
import com.vishal.departmentservice.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DepartmentController {

    private final DepartmentRepository departmentRepository;

    @PostMapping("/")
    public Department add(@RequestBody Department department){
        return departmentRepository.addDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getById(@PathVariable Long id){
        return departmentRepository.findById(id);
    }

    @GetMapping("/")
    public List<Department> list(){
        return departmentRepository.allList();
    }
}
