package com.vishal.departmentservice.domain;

public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
