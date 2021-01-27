package com.domesama.owo.repositories;

import com.domesama.owo.models.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
