package com.example.apidemo.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;

@Entity
public class VolumeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String subTitle;
    @OneToMany(targetEntity = VolumeInfo.class)
    private List<String> authors;
    private String publisher;
    private String publishedDate;

    @OneToMany(targetEntity = VolumeInfo.class)
    private List<IndustryIdentifier> industryIdentifiers;
    @OneToMany(targetEntity = VolumeInfo.class)
    private List<String> readingModes;
    private Integer pageCount;
    private String printType;
    private Integer averageRating;
    private Integer ratingsCount;
    private String maturityRating;
    private Boolean allowAnonLogging;
    private String contentVersion;
    private HashMap<String, Boolean> panelizationSummary;
    private HashMap<String, String> imageLinks;
    private String language;
    private String previewLink;
    private String infoLink;
    private String canonicalVolumeLink;

}