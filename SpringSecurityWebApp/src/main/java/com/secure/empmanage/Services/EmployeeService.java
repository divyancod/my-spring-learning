package com.secure.empmanage.Services;

import com.secure.empmanage.Configurations.EmployeeAlreadyExists;
import com.secure.empmanage.Configurations.EmployeeNotFound;
import com.secure.empmanage.Models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> fetchAllEmployees();
    void addEmployee(Employee employee) throws EmployeeAlreadyExists;
    Employee fetchEmployee(String id) throws EmployeeNotFound;
    void deleteEmployee(String id);
    void toggleEmployeeState(String userid);
}
