package com.vishal.departmentservice.domain;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Department {
    private Long id;
    private String name;
    private List<Employee> employees;

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
    }
}
