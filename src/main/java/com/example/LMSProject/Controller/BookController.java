package com.example.LMSProject.Controller;

import com.example.LMSProject.Models.Author;
import com.example.LMSProject.Models.Book;
import com.example.LMSProject.Repository.AuthorRepositary;
import com.example.LMSProject.Services.BookSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookSevice bookSevice;
    @PostMapping("/add_book")
    public String addBook(@RequestBody  Book book){
      return bookSevice.addBook(book);
    }



}
