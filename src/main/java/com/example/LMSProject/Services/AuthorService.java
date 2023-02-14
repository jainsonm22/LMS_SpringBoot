package com.example.LMSProject.Services;

import com.example.LMSProject.Models.Author;
import com.example.LMSProject.Repository.AuthorRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
@Autowired
    AuthorRepositary authorRepositary;
public String createAuthor(Author author){
    authorRepositary.save(author);
    return "Author create successfully";
}
}
