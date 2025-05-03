package com.practice.streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int employeeId;
    private String name;
    private int age;
    private String department;
    private String gender;
    private double salary;
}
