package com.secure.empmanage.Dao;

import com.secure.empmanage.Configurations.EmployeeNotFound;
import com.secure.empmanage.Configurations.EmployeeRowMapper;
import com.secure.empmanage.Models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<Employee> getEmployeeList() {
        String sql = "SELECT * FROM employeedetails where id<>1 and id<>2";
        List<Employee> employees = jdbcTemplate.query(sql, new EmployeeRowMapper());
        return employees;
    }

    @Override
    public void addEmployeeToDB(Employee employee) {
        //database addition
        Object[] objects = {employee.getName(), employee.getEmail(), employee.getPosition(), employee.getClearning()};
        String sql = "INSERT INTO employeedetails(name,email,position,clearning) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql, objects);

        sql = "select id from employeedetails where email = ?";
        String userid = jdbcTemplate.queryForObject(sql, String.class, employee.getEmail());

        sql = "insert into users(userid,email,password,enabled) values (?,?,?,?)";
        Object[] users = {userid, employee.getEmail(), passwordEncoder.encode("user123"), 0};
        jdbcTemplate.update(sql, users);

        sql = "insert into roles(userid,role) values (?,?)";
        jdbcTemplate.update(sql, userid, "user");
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
        String sql = "UPDATE employeedetails SET name=?,email=?,position=?,clearning=? WHERE id=?";
        Object[] params = {employee.getName(), employee.getEmail(), employee.getPosition(), employee.getClearning(), employee.getId()};
        jdbcTemplate.update(sql, params);
    }

    @Override
    public void deleteEmployeeDetails(String id) {
        String sql = "DELETE FROM employeedetails WHERE id=?";
        jdbcTemplate.update(sql, id);
        sql = "DELETE FROM users where userid=?";
        jdbcTemplate.update(sql, id);
        sql = "DELETE FROM roles where userid=?";
        jdbcTemplate.update(sql, id);

    }

    @Override
    public boolean userCheck(String email) {
        String sql = "select * from employeedetails where email=?";
        List<Employee> employee = jdbcTemplate.query(sql, new EmployeeRowMapper(), email);
        System.out.println(employee);
        if (employee == null)
            return false;
        else if (employee.size() == 0)
            return false;
        return true;
    }

    @Override
    public void toggleStateDb(String id) {
        String sql = "UPDATE `users` SET `enabled`= NOT `enabled` where userid= ? ";
        jdbcTemplate.update(sql,id);
    }
}
