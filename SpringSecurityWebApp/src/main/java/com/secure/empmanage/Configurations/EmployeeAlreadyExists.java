package com.secure.empmanage.Configurations;

public class EmployeeAlreadyExists extends Exception{
    public EmployeeAlreadyExists(String message) {
        super(message);
    }
}
