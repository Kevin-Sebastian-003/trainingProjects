package com.example.school.services;

import java.util.List;

import com.example.school.entity.StudentEntity;

public interface StudentServiceInterface {

    public void save(StudentEntity student);
    public List<StudentEntity> getStudents();
    public StudentEntity getStudentById(Integer id);

}