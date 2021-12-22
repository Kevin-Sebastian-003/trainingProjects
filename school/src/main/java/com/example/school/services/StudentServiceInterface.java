package com.virtusa.school.services;

import java.util.List;

import com.virtusa.school.entity.StudentEntity;

public interface StudentServiceInterface {

    public void save(StudentEntity student);
    public List<StudentEntity> getStudents();
    public StudentEntity getStudentById(Integer id);

}