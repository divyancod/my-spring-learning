package com.secure.empmanage.Services;

import com.secure.empmanage.Configurations.EmployeeAlreadyExists;
import com.secure.empmanage.Configurations.EmployeeNotFound;
import com.secure.empmanage.Dao.EmployeeDao;
import com.secure.empmanage.Models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<Employee> fetchAllEmployees() {
        List<Employee> nob = employeeDao.getEmployeeList();
        return nob;
    }

    @Override
    public void addEmployee(Employee employee) throws EmployeeAlreadyExists{
        if(employee.getId()==0 && employeeDao.userCheck(employee.getEmail()))
        {
            throw new EmployeeAlreadyExists("Employee Already Exists");
        }
        if (employee.getId() == 0)
            employeeDao.addEmployeeToDB(employee);
        else
            employeeDao.updateEmployeeDetail(employee);
    }

    @Override
    public Employee fetchEmployee(String id) throws EmployeeNotFound {
        Employee employee = employeeDao.getEmployee(id);
        System.out.println(employee + "");
        return employee;
    }

    @Override
    public void deleteEmployee(String id) {
        employeeDao.deleteEmployeeDetails(id);
    }

    @Override
    public void toggleEmployeeState(String userid) {
        employeeDao.toggleStateDb(userid);
    }

}
