package com.example.school.services;

import java.util.List;

import javax.transaction.Transactional;

// import com.example.school.config.Config;
import com.example.school.entity.StudentEntity;
import com.example.school.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService implements StudentServiceInterface{
    
    // @Autowired
    // private Config studentConfig;

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