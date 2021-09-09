package com.secure.empmanage.Configurations;

import com.secure.empmanage.Models.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getInt("id"));
        employee.setName(resultSet.getString("name"));
        employee.setPhone(resultSet.getString("phone"));
        employee.setLocation(resultSet.getString("location"));
        employee.setEmail(resultSet.getString("email"));
        employee.setCollege(resultSet.getString("college"));
        employee.setCourse(resultSet.getString("course"));
        employee.setBatch(resultSet.getString("batch"));
        employee.setTskills(resultSet.getString("tskills"));
        employee.setClearning(resultSet.getString("clearning"));
        employee.setPosition(resultSet.getString("position"));
        return employee;
    }
}
