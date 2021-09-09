package com.secure.empmanage.Controller;

import com.secure.empmanage.Configurations.EmployeeNotFound;
import com.secure.empmanage.Models.Employee;
import com.secure.empmanage.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/")
    public String homePage(Model model) {
        List<Employee> employeeList = employeeService.fetchAllEmployees();
        model.addAttribute("totalEmployees", employeeList);
        return "homepage";
    }

    @RequestMapping("/add-employee")
    public String addNewStudent(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employeeModel", employee);
        return "add-student";
    }

    @PostMapping("/process-data")
    public String processStudent(@Valid @ModelAttribute("employeeModel") Employee employee, BindingResult result) {
        System.out.println(result.getAllErrors());
        if (result.hasErrors()) {
            return "add-student";
        }
        employeeService.addEmployee(employee);
        return "redirect:/";
    }

    @PostMapping("/update-data")
    public String updateStudent(@RequestParam("id") String id, Model model) throws EmployeeNotFound {
        Employee employee = employeeService.fetchEmployee(id);
        model.addAttribute("employeeModel", employee);
        return "add-student";
    }

    @PostMapping("/delete-employee")
    public String deleteStudent(@RequestParam("id") String id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }

    @RequestMapping("/show-employee")
    public String showDetails(@RequestParam("id")String id,Model model) throws EmployeeNotFound
    {
        Employee employees = employeeService.fetchEmployee(id);
        model.addAttribute("employee", employees);
        return "student-details";
    }

    @RequestMapping("/user-profile")
    public String updateUser(@RequestParam("id")String id,Model model) throws EmployeeNotFound
    {
        Employee employee = employeeService.fetchEmployee(id);
        model.addAttribute("employee", employee);
        return "update-profile";
    }

    @PostMapping("/update-user-profile")
    public String updateUserProfile(@ModelAttribute("employee") Employee employee)
    {
        return "redirect:/";
    }
}
