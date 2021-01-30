package com.domesama.owo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import java.util.List;

import com.domesama.owo.models.Author;
import com.domesama.owo.models.Book;
import com.domesama.owo.models.Publisher;
import com.domesama.owo.repositories.AuthorRepository;
import com.domesama.owo.repositories.BookRepository;
import com.domesama.owo.repositories.PublisherRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class RESTController {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final PublisherRepository publisherRepository;

    @GetMapping(value = "/books")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping(value = "/authors")
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    @GetMapping(value = "/publishers")
    public List<Publisher> getPublishers() {
        return publisherRepository.findAll();
    }

}
