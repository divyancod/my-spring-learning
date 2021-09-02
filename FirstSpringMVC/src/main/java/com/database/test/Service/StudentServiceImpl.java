package com.database.test.Service;

import com.database.test.Dao.StudentDao;
import com.database.test.exception.StudentNotFound;
import com.database.test.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentDao studentDao;
    @Override
    public List<Student> fetchAllStudents() {
        List<Student> nob = studentDao.getStudentList();
        return nob;
    }

    @Override
    public void addStudent(Student student) {
        if(student.getId()==0)
            studentDao.addStudentToDB(student);
        else
            studentDao.updateStudentDetail(student);
    }

    @Override
    public Student fetchStudent(String id) throws StudentNotFound { Student student = studentDao.getStudent(id);
    System.out.println(student+"");
    return student;
    }

    @Override
    public void deleteStudent(String id) {
        studentDao.deleteStudentDetails(id);
    }

}
