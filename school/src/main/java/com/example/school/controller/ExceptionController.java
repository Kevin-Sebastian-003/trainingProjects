package com.example.school.controller;

import com.example.school.exception.StudentException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController extends BaseController{

    @ExceptionHandler(value = { StudentException.class })
    public ModelAndView handleStudentException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", ex.getMessage());
        mv.setViewName("error");
        logger.error("Error occurred", ex);
        return mv;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleGlobalException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Some error has occurred. Please Try later.");
        mv.setViewName("error");
        logger.error("Error occured", ex);
        return mv;
    }
}