package com.secure.empmanage.Dao;

import com.secure.empmanage.Configurations.EmployeeNotFound;
import com.secure.empmanage.Models.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getEmployeeList();
    void addEmployeeToDB(Employee employee);
    Employee getEmployee(String id) throws EmployeeNotFound;
    void updateEmployeeDetail(Employee employee);
    void deleteEmployeeDetails(String id);
    boolean userCheck(String email);
    void toggleStateDb(String id);
}
