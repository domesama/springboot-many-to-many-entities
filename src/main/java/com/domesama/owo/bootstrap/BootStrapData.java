package com.domesama.owo.bootstrap;

import java.util.Set;

import com.domesama.owo.models.Author;
import com.domesama.owo.models.Book;
import com.domesama.owo.models.Publisher;
import com.domesama.owo.repositories.AuthorRepository;
import com.domesama.owo.repositories.BookRepository;
import com.domesama.owo.repositories.PublisherRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    // private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {
        Author owo = new Author("OwO", "UwU");
        Book owoBook = new Book("SomeBookOwO", "123123");
        // Publisher myPublisher = new Publisher("OwOPublisher", "42069 UwUStreets",
        // "Somewhere", "UwUState", "123520");

        owo.getBooks().add(owoBook);
        owoBook.getAuthors().add(owo);
        // owoBook.setPublishersOwO(myPublisher);
        // myPublisher.getBooks().add(owoBook);

        authorRepository.save(owo);
        bookRepository.save(owoBook);
        // publisherRepository.save(myPublisher);
        ///////////////////////////////////////////////////////////////////////////////////////
        Author uwu = new Author("UwU", "Nani");
        Book uwuBook = new Book("UwUBook", "123123123123");
        uwu.getBooks().add(uwuBook);
        uwuBook.getAuthors().add(uwu);
        // myPublisher.getBooks().add(uwuBook);
        // uwuBook.setPublishersOwO(myPublisher);

        authorRepository.save(uwu);
        bookRepository.save(uwuBook);
        // publisherRepository.save(myPublisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Number Of Books" + bookRepository.count());
        // System.out.println("Publisher Number of Books" +
        // myPublisher.getBooks().size());
    }
}
