package com.example.BookService.dto;

public record BookDTO (
        Long id,
        String title,
        AuthorDTO author)
{

}
