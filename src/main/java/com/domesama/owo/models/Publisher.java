package com.domesama.owo.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String addressLine;
    private String city;
    private String state;
    private String postalCode;

    @EqualsAndHashCode.Exclude
    private Set<Book> books = new HashSet<>();
}
