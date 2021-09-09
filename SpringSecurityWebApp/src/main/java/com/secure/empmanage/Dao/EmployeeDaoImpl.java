package com.secure.empmanage.Dao;

import com.secure.empmanage.Configurations.EmployeeNotFound;
import com.secure.empmanage.Configurations.EmployeeRowMapper;
import com.secure.empmanage.Models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> getEmployeeList() {
        String sql = "SELECT * FROM employeedetails";
        List<Employee> employees = jdbcTemplate.query(sql, new EmployeeRowMapper());
        return employees;
    }

    @Override
    public void addEmployeeToDB(Employee employee) {
        //database addition
        Object[] objects = {employee.getName(), employee.getEmail(), employee.getPosition()};
        String sql = "INSERT INTO employeedetails(name,email,position) VALUES (?,?,?)";
        jdbcTemplate.update(sql, objects);
        System.out.println(employee + " Added Sucessfully to database");
    }

    @Override
    public Employee getEmployee(String id) throws EmployeeNotFound {
        String sql = "SELECT * FROM employeedetails WHERE id= ? ";
        List<Employee> employee = jdbcTemplate.query(sql, new EmployeeRowMapper(), id);
        if (employee.size() == 0) {
            throw new EmployeeNotFound("Employee Not Found");
        } else if (employee.size() == 1) {
            return employee.get(0);
        } else {
            throw new EmployeeNotFound("Invalid Employee");
        }
    }

    @Override
    public void updateEmployeeDetail(Employee employee) {
        String sql = "UPDATE employeedetails SET name=?,email=?,position=? WHERE id=?";
        Object[] params = {employee.getName(), employee.getEmail(), employee.getPosition(), employee.getId()};
        jdbcTemplate.update(sql, params);
    }

    @Override
    public void deleteEmployeeDetails(String id) {
        String sql = "DELETE FROM employeedetails WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
}
