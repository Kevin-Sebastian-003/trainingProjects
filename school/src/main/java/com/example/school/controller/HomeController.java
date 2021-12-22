package com.example.school.controller;

import com.example.school.model.DepartmentModel;
import com.example.school.model.StaffModel;
import com.example.school.model.StudentModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController extends BaseController{

    @RequestMapping(value="/Home", method = RequestMethod.GET)
    public String viewHomeRegistrationPage(Model model){
        logger.info("Opened Home page");
        return "Home";
    }

    @RequestMapping(value="/StudentRegistration", method = RequestMethod.GET)
    public String viewStudentRegistrationPage(Model model){
        logger.info("Opened Student Registration Page");
        model.addAttribute("studentModel", new StudentModel());
        return "StudentRegistration";
    }

    @RequestMapping(value="/DepartmentRegistration", method = RequestMethod.GET)
    public String viewDepartmentRegistrationPage(Model model){
        logger.info("Opened Department Registration Page");
        model.addAttribute("studentModel", new DepartmentModel());
        return "StudentRegistration";
    }

    @RequestMapping(value="/StaffRegistration", method = RequestMethod.GET)
    public String viewStaffRegistrationPage(Model model){
        logger.info("Opened Staff Registration Page");
        model.addAttribute("studentModel", new StaffModel());
        return "StudentRegistration";
    }

}