package com.vishal.departmentservice.repository;

import com.vishal.departmentservice.domain.Department;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class DepartmentRepository {

    private  List<Department> departments = new LinkedList<>();

    public Department addDepartment (Department department){
        departments.add(department);
        return department;
    }

    public Department findById(Long id){
        return departments.stream()
                .filter(i -> i.getId().equals(id))
                .findAny().orElseThrow();
    }

    public List<Department> allList(){
        return departments;
    }


}
