package com.domesama.owo.repositories;

import com.domesama.owo.models.Publisher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
