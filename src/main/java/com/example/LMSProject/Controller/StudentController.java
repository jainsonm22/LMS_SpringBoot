package com.example.LMSProject.Controller;

import com.example.LMSProject.Models.Student;
import com.example.LMSProject.Repository.StudentRepository;
import com.example.LMSProject.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentServices studentServices;
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add")
    public String createStudent(@RequestBody Student student){
      return studentServices.createString(student);
    }


}
