package com.example.school.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class StaffModel {
   
    private Integer id;
    private String name;
    private String email;

    @Min(value=3)
    @Max(value=150)
    private Integer age;

    private String dept;

    @Min(value=1900)
    @Max(value=2100)
    private Integer year;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        return "Student [age=" + age + ", dept=" + dept + ", email=" + email + ", id=" + id + ", name=" + name
                + ", year=" + year + "]";
    }
}