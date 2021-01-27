package com.domesama.owo.bootstrap;

import com.domesama.owo.models.Author;
import com.domesama.owo.models.Book;
import com.domesama.owo.repositories.AuthorRepository;
import com.domesama.owo.repositories.BookRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Author owo = new Author("OwO", "UwU");
        Book owoBook = new Book("SomeBookOwO", "123123");

        owo.getBooks().add(owoBook);
        owoBook.getAuthors().add(owo);

        authorRepository.save(owo);
        bookRepository.save(owoBook);

        Author uwu = new Author("UwU", "Nani");
        Book uwuBook = new Book("UwUBook", "123123123123");
        uwu.getBooks().add(uwuBook);
        uwuBook.getAuthors().add(uwu);

        authorRepository.save(uwu);
        bookRepository.save(uwuBook);

        System.out.println("Started in Bootstrap");
        System.out.println("Number Of Books" + bookRepository.count());
    }
}
