package com.example.LMSProject.Services;

import com.example.LMSProject.Models.Author;
import com.example.LMSProject.Models.Book;
import com.example.LMSProject.Repository.AuthorRepositary;
import com.example.LMSProject.Repository.BookRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookSevice {


    @Autowired
    AuthorRepositary authorRepositary;
    public String addBook(Book book){
        //get author id from book onbject @RequestBody
        int authorId= book.getAuthor().getId();

        //find author object for requested author id
        Author author=authorRepositary.findById(authorId).get();

        //Basic atribute are allread set from postman
        //settign foriegn key attribue int e child class
        book.setAuthor(author);

        //we need to update the list of book written in the parent class

        List<Book> CurrentBookWritten=author.getBooksWriiten();
        CurrentBookWritten.add(book);

        //now book is to be  saved, also author is also to be saved
        //need to update the author ,bcz authore entity has been updated ....we need to update it

         authorRepositary.save(author);//data was modified we update author ,Book will automattically save
        //save function will work for update and save for both
        // this save function will update author object and save book object ,it will be done bcz of cascade effect
        //whre book is child and author is parent
        //if priamrky allready exixst in db then it will update that entity attribute in db;
        //if pk is not allready present ittrated as new object and save in db

        return  "book save successfully";

    }
}
