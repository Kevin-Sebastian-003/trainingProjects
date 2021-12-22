package com.virtusa.school.services;

import java.util.List;

import javax.transaction.Transactional;

import com.virtusa.school.config.StudentConfig;
import com.virtusa.school.entity.StudentEntity;
import com.virtusa.school.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService implements StudentServiceInterface{
    
    @Autowired
    private StudentConfig studentConfig;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void save(StudentEntity student){
        studentRepository.save(student);        
    }

    @Override
    public List<StudentEntity> getStudents() {
        return studentRepository.getStudents();
    }

    @Override
    public StudentEntity getStudentById(Integer id) {
        return studentRepository.getStudentById(id);
    }

}