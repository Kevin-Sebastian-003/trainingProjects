
package com.example.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

import com.example.school.entity.StudentEntity;
import com.example.school.exception.StudentException;
import com.example.school.model.StudentModel;
import com.example.school.services.StudentServiceInterface;



@Controller
public class DepartmentController extends BaseController{

    @Autowired
    private StudentServiceInterface StudentService;

    @RequestMapping(value="/StudentRegistration", method = RequestMethod.POST)
    public ModelAndView viewStudentRegistrationPage(
        @Valid
        @ModelAttribute("studentModel")StudentModel studentModel, BindingResult response
        )throws StudentException{
             logger.info("submitted Registration Page");
            ModelAndView mv = new ModelAndView();
            if(response.hasErrors()){
                logger.error(response.getAllErrors().toString());
                mv.addObject("errorMessage","Note- Age should be between 3 and 150<br/>year should be between 1900 and 2100");
                mv.setViewName("StudentRegistration");
                return mv;
            }

            StudentEntity studentEntity = new StudentEntity();
            logger.error(studentModel.toString());
            studentEntity.setId(studentModel.getId());
            studentEntity.setName(studentModel.getEmail());
            studentEntity.setEmail(studentModel.getEmail());
            studentEntity.setAge(studentModel.getAge());
            studentEntity.setDept(studentModel.getDept());
            studentEntity.setYear(studentModel.getYear());
            StudentService.save(studentEntity);

            mv.setViewName("Landing");
            mv.addObject("message","Added new student");
            return mv;
        }

}