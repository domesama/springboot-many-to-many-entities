package com.domesama.owo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import java.util.List;

import com.domesama.owo.models.Book;
import com.domesama.owo.repositories.BookRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class RESTController {
    private final BookRepository bookRepository;

    @GetMapping(value = "/books")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

}
