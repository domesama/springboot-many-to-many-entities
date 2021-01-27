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

import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String isbn;

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "authors"))
    private Set<Author> authors = new HashSet<>();

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    // public Book() {
    // }

    // public Book(Long id, String title, String isbn, Set<Author> authors) {
    // this.id = id;
    // this.title = title;
    // this.isbn = isbn;
    // this.authors = authors;
    // }

    // public Long getId() {
    // return this.id;
    // }

    // public void setId(Long id) {
    // this.id = id;
    // }

    // public String getTitle() {
    // return this.title;
    // }

    // public void setTitle(String title) {
    // this.title = title;
    // }

    // public String getIsbn() {
    // return this.isbn;
    // }

    // public void setIsbn(String isbn) {
    // this.isbn = isbn;
    // }

    // public Set<Author> getAuthors() {
    // return this.authors;
    // }

    // public void setAuthors(Set<Author> authors) {
    // this.authors = authors;
    // }

    // public Book id(Long id) {
    // setId(id);
    // return this;
    // }

    // public Book title(String title) {
    // setTitle(title);
    // return this;
    // }

    // public Book isbn(String isbn) {
    // setIsbn(isbn);
    // return this;
    // }

    // public Book authors(Set<Author> authors) {
    // setAuthors(authors);
    // return this;
    // }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // @Override
    // public String toString() {
    // return "{" + " id='" + getId() + "'" + ", title='" + getTitle() + "'" + ",
    // isbn='" + getIsbn() + "'"
    // + ", authors='" + getAuthors() + "'" + "}";
    // }

}
