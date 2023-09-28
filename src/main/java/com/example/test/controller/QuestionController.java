package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @GetMapping("test")
    public String test(){ //List<Question>
        System.out.println("hello");
        return "Hello";
    }
}
