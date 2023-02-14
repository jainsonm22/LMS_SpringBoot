package com.example.LMSProject.Repository;

import com.example.LMSProject.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardReositary extends JpaRepository<Card, Integer> {
}
