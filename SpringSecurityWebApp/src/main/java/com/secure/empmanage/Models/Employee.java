package com.secure.empmanage.Models;

import javax.validation.constraints.NotBlank;

public class Employee {

    private int id;
    @NotBlank(message = "* Employee Name can't be empty")
    private String name;
    private String phone;
    private String location;
    private String email;
    private String college;
    private String course;
    private String batch;
    private String tskills;
    private String clearning;
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getTskills() {
        return tskills;
    }

    public void setTskills(String tskills) {
        this.tskills = tskills;
    }

    public String getClearning() {
        return clearning;
    }

    public void setClearning(String clearning) {
        this.clearning = clearning;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                ", email='" + email + '\'' +
                ", college='" + college + '\'' +
                ", course='" + course + '\'' +
                ", batch='" + batch + '\'' +
                ", tskills='" + tskills + '\'' +
                ", clearning='" + clearning + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
