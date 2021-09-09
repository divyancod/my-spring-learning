package com.secure.empmanage.Services;

import com.secure.empmanage.Configurations.EmployeeNotFound;
import com.secure.empmanage.Models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> fetchAllEmployees();
    void addEmployee(Employee employee);
    Employee fetchEmployee(String id) throws EmployeeNotFound;
    void deleteEmployee(String id);
}
