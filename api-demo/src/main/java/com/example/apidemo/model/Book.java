package com.example.apidemo.model;

import javax.persistence.Entity;
import java.util.HashMap;

@Entity
public class Book {
    private String kind;
    private String id;
    private String etag;
    private String selfLink;
    private VolumeInfo volumeInfo;
    private SalesInfo salesInfo;
    private AccessInfo accessInfo;
    private HashMap<String, String> searchInfo;
}
