package com.database.test.Dao;

import com.database.test.StudentRowMapper;
import com.database.test.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> getStudentList() {
        String sql = "SELECT * FROM students";
        List<Student> students = jdbcTemplate.query(sql, new StudentRowMapper());
        return students;
    }

    @Override
    public void addStudentToDB(Student student) {
        //database addition
        Object[] objects = {student.getName(),student.getPhone(),student.getLocation()};
        String sql = "INSERT INTO students(name,phone,location) VALUES (?,?,?)";
        jdbcTemplate.update(sql,objects);
        System.out.println(student+" Added Sucessfully to database");
    }

    @Override
    public Student getStudent(String id) {
        String sql="SELECT * FROM students WHERE id= ? ";
        Student student = jdbcTemplate.queryForObject(sql,new StudentRowMapper(),id);
        System.out.println(student.getId()+" getStudent");
        return student;
    }

    @Override
    public void updateStudentDetail(Student student) {
        String sql = "UPDATE students SET name=?,phone=?,location=? WHERE id=?";
        Object[] params = {student.getName(),student.getPhone(),student.getLocation(),student.getId()};
        jdbcTemplate.update(sql,params);
    }

    @Override
    public void deleteStudentDetails(String id) {
        String sql = "DELETE FROM students WHERE id=?";
        jdbcTemplate.update(sql,id);
    }

}
