package com.example.apidemo.model;

import javax.persistence.Entity;
import java.util.HashMap;
import java.util.List;

@Entity
public class VolumeInfo {
    private String title;
    private String subTitle;
    private List<String> authors;
    private List<String> publishers;
    private List<IndustryIdentifier> industryIdentifiers;
    private Integer pageCount;
    private String printType;
    private Integer averageRating;
    private Integer ratingsCount;
    private String maturityRating;
    private Boolean allowAnonLogging;
    private String contentVersion;
    private HashMap<String, Boolean> panelization;
    private HashMap<String, String> imageLinks;
    private String language;
    private String previewLink;
    private String infoLink;
    private String canonicalVolumeLink;

}