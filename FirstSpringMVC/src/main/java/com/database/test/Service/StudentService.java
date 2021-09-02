package com.database.test.Service;

import com.database.test.exception.StudentNotFound;
import com.database.test.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> fetchAllStudents();
    void addStudent(Student student);
    Student fetchStudent(String id) throws StudentNotFound;
    void deleteStudent(String id);
}
