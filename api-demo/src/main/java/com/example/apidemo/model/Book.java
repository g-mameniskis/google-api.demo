package com.example.apidemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.HashMap;

@Entity
public class Book {
    @Id
    private String id;
    private String kind;
    private String etag;
    private String selfLink;

    @OneToOne(targetEntity = Book.class)
    private VolumeInfo volumeInfo;

    @OneToOne
    private SaleInfo saleInfo;

    @OneToOne
    private AccessInfo accessInfo;

    @OneToOne(targetEntity = Book.class)
    private HashMap<String, String> searchInfo;
}
