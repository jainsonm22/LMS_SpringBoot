package com.example.LMSProject.Controller;

import com.example.LMSProject.Models.Author;
import com.example.LMSProject.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("author")
public class AuthorController {
@Autowired
 AuthorService authorService;


 @PostMapping("/add_author")
  public String addAuthor(@RequestBody Author author)  {
  return authorService.createAuthor(author);
 }

}
