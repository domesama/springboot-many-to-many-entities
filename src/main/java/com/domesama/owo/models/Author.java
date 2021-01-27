package com.domesama.owo.models;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author() {
    }

    public Author(Long id, String firstName, String lastName, Set<Book> books) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    // public Long getId() {
    // return this.id;
    // }

    // public void setId(Long id) {
    // this.id = id;
    // }

    // public String getFirstName() {
    // return this.firstName;
    // }

    // public void setFirstName(String firstName) {
    // this.firstName = firstName;
    // }

    // public String getLastName() {
    // return this.lastName;
    // }

    // public void setLastName(String lastName) {
    // this.lastName = lastName;
    // }

    // public Set<Book> getBooks() {
    // return this.books;
    // }

    // public void setBooks(Set<Book> books) {
    // this.books = books;
    // }

    // public Author id(Long id) {
    // setId(id);
    // return this;
    // }

    // public Author firstName(String firstName) {
    // setFirstName(firstName);
    // return this;
    // }

    // public Author lastName(String lastName) {
    // setLastName(lastName);
    // return this;
    // }

    // public Author books(Set<Book> books) {
    // setBooks(books);
    // return this;
    // }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Author)) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(id, author.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // @Override
    // public String toString() {
    // return "{" + " id='" + getId() + "'" + ", firstName='" + getFirstName() + "'"
    // + ", lastName='" + getLastName()
    // + "'" + ", books='" + getBooks() + "'" + "}";
    // }

}
