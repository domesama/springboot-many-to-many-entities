package com.domesama.owo.models;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String isbn;

    @EqualsAndHashCode.Exclude
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "authors"))
    private Set<Author> authors = new HashSet<>();

    // This refers to the current class (Book) having many mapped to a single
    // following Entity (Publisher)
    @EqualsAndHashCode.Exclude
    @ManyToOne
    private Publisher publisher;

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    // public void setPublishersOwO(Publisher myPublisher) {
    // this.publishers.add(myPublisher);
    // }

    // @Override
    // public boolean equals(Object o) {
    // if (o == this)
    // return true;
    // if (!(o instanceof Book)) {
    // return false;
    // }
    // Book book = (Book) o;
    // return Objects.equals(id, book.id);
    // }

    // @Override
    // public int hashCode() {
    // return Objects.hashCode(id);
    // }

}
