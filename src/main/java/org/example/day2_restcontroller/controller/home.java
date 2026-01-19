package org.example.day2_restcontroller.controller;

import org.example.day2_restcontroller.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping("/")
    public StudentModel getStudent(){
        StudentModel student = new StudentModel(1,"Tushar","tusharbansal@gmail.com");
        return student;

    }
}
