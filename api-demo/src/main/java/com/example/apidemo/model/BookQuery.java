package com.example.apidemo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class BookQuery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String kind;
    private Integer totalItems;
    @OneToMany
    private List<Book> items;
}
