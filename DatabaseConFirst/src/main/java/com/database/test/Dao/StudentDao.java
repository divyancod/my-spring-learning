package com.database.test.Dao;

import com.database.test.model.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getStudentList();
    void addStudentToDB(Student student);
    Student getStudent(String id);
    void updateStudentDetail(Student student);
    void deleteStudentDetails(String id);
}
