package com.example.LMSProject.Services;

import com.example.LMSProject.Enums.CardStatus;
import com.example.LMSProject.Models.Card;
import com.example.LMSProject.Models.Student;
import com.example.LMSProject.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {
    @Autowired
    StudentRepository studentRepository;

    public String createString(Student student){
        Card card=  new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setStudentVaribleName(student);
        student.setCard(card);
        studentRepository.save(student);

        return "data update successfully";

    }
}
