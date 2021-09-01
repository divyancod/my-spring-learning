package com.database.test.Service;

import com.database.test.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> fetchAllStudents();
    void addStudent(Student student);
    Student fetchStudent(String id);
    void deleteStudent(String id);
}
