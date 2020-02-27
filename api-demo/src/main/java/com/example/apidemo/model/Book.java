package com.example.apidemo.model;

import com.example.apidemo.utils.Jsonifier;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private String id;
    private String kind;
    private String etag;
    private String selfLink;

    @OneToOne(mappedBy = "book")
    private VolumeInfo volumeInfo;

    @OneToOne(mappedBy = "book")
    private SaleInfo saleInfo;

    @OneToOne(mappedBy = "book")
    private AccessInfo accessInfo;

    @ElementCollection
    private Map<String, String> searchInfo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "book_query_result_id")
    private BookQueryResult bookQueryResult;

    public Book() {
    }

    public BookQueryResult getBookQueryResult() {
        return bookQueryResult;
    }

    public void setBookQueryResult(BookQueryResult bookQueryResult) {
        this.bookQueryResult = bookQueryResult;
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

    public Map<String, String> getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(Map<String, String> searchInfo) {
        this.searchInfo = searchInfo;
    }

    @Override
    public String toString() {
        return Jsonifier.toJson(this);
    }
}