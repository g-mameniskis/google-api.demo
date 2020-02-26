package com.example.apidemo.model;

import com.example.apidemo.utils.Jsonifier;

import javax.persistence.*;
import java.util.HashMap;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    public SaleInfo getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    public AccessInfo getAccessInfo() {
        return accessInfo;
    }

    public void setAccessInfo(AccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    public HashMap<String, String> getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(HashMap<String, String> searchInfo) {
        this.searchInfo = searchInfo;
    }

    @Override
    public String toString() {
        return Jsonifier.toJson(this);
    }
}