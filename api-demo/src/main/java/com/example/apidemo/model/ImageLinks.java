package com.example.apidemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImageLinks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String smallThumbnail;
    private String thumbnail;
    private String small;
    private String medium;
    private String large;
    private String extraLarge;

    public ImageLinks(String smallThumbnail, String thumbnail, String small, String medium, String large, String extraLarge) {
        this.smallThumbnail = smallThumbnail;
        this.thumbnail = thumbnail;
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.extraLarge = extraLarge;
    }

    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getSmall() {
        return small;
    }

    public String getMedium() {
        return medium;
    }

    public String getLarge() {
        return large;
    }

    public String getExtraLarge() {
        return extraLarge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ImageLinks() {
    }

    @Override
    public String toString() {
        return "ImageLinks{" +
                "id=" + id +
                ", smallThumbnail='" + smallThumbnail + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", small='" + small + '\'' +
                ", medium='" + medium + '\'' +
                ", large='" + large + '\'' +
                ", extraLarge='" + extraLarge + '\'' +
                '}';
    }
}
