package com.example.LMSProject.Repository;

import com.example.LMSProject.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepositary extends JpaRepository<Author, Integer > {

}
