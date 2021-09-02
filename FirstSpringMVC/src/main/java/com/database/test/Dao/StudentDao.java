package com.database.test.Dao;

import com.database.test.exception.StudentNotFound;
import com.database.test.model.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getStudentList();
    void addStudentToDB(Student student);
    Student getStudent(String id) throws StudentNotFound;
    void updateStudentDetail(Student student);
    void deleteStudentDetails(String id);
}
