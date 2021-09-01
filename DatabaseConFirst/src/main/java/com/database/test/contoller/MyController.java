package com.database.test.contoller;

import com.database.test.Service.StudentService;
import com.database.test.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/")
    public String getHome(Model model)
    {
        List<Student> studentList = studentService.fetchAllStudents();
        model.addAttribute("totalStudents",studentList);
        return "homepage";
    }
    @RequestMapping("/add-student")
    public String addNewStudent(Model model)
    {
        Student student = new Student();
        model.addAttribute("studentModel",student);
        return "add-student";
    }
    @GetMapping("/process-data")
    public String processStudent(@ModelAttribute("studentModel")Student student)
    {
        studentService.addStudent(student);
        return "redirect:/";
    }
    @PostMapping("/update-data")
    public String updateStudent(@RequestParam("id")String id,Model model)
    {
        Student student = studentService.fetchStudent(id);
        model.addAttribute("studentModel",student);
        return "add-student";
    }
    @PostMapping("/delete-student")
    public String deleteStudent(@RequestParam("id")String id)
    {
        studentService.deleteStudent(id);
        return "redirect:/";
    }
    @RequestMapping("/show-student")
    public String showDetails(@RequestParam("id")String id,Model model)
    {
        Student student = studentService.fetchStudent(id);
        model.addAttribute("student",student);
        return "student-details";
    }
}
