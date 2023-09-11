package com.example.SpringAcademyTDD.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cashcard")
public class CashCardController {

    private CashCardRepository cashCardRepository;
    CashCardController(CashCardRepository cashCardRepository){
        this.cashCardRepository = cashCardRepository;
    }

    @GetMapping("/{requestedId}")
    public ResponseEntity<CashCard> findById(@PathVariable Long id){
        Optional<CashCard> optionalCashCard = cashCardRepository.findById(id);
        if (optionalCashCard.isPresent()){
            return ResponseEntity.ok(optionalCashCard.get());
        }else
        {
            return ResponseEntity.notFound().build();
        }

    }
}




