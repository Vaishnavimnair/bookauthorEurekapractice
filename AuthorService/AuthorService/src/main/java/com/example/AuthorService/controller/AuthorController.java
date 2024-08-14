package com.example.AuthorService.controller;

import com.example.AuthorService.domain.Author;
import com.example.AuthorService.repo.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/api")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @GetMapping("/authors/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return authorRepository.findById(id).orElseThrow(()->new RuntimeException("Author not found"));
    }
}