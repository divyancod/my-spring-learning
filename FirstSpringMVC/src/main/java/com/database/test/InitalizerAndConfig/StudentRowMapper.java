package com.database.test.InitalizerAndConfig;

import com.database.test.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        student.setPhone(resultSet.getString("phone"));
        student.setLocation(resultSet.getString("location"));
        return student;
    }
}
