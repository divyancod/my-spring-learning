package com.database.test.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Student {
    private int id;
    @NotBlank(message = "* Student Name can't be empty")
    private String name;
    @Pattern(regexp = "^[0-9]{10}$", message = "* Enter 10 digit Phone Number")
    @NotBlank(message = "* Student Phone can't be empty")
    private String phone;
    private String location;

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

    public Student() {
    }

    public Student(String name, String phone, String location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
