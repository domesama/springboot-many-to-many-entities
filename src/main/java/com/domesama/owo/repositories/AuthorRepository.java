package com.domesama.owo.repositories;

import com.domesama.owo.models.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
