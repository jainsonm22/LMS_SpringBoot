package com.example.LMSProject.Repository;

import com.example.LMSProject.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepositary extends JpaRepository<Book,Integer> {
}
