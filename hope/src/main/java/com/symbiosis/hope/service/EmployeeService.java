package com.symbiosis.hope.service;

import java.util.List;

import com.symbiosis.hope.model.Employee;

public interface EmployeeService {
Employee createEmp(Employee emp);
List<Employee> getAllEmps();
Employee searchEmp (long id);
Employee updateEmployee (long id,Employee emp);
boolean delete (long id);
}
