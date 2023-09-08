package com.example.SpringAcademyTDD.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashcard")
public class CashCardController {

    @GetMapping("/{requestedId}")
    public ResponseEntity<String> findById(){
        return ResponseEntity.ok("{}");
    }
}
