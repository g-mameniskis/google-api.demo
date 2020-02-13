package com.example.apidemo.model;

public class ImageLinks {

    private final String smallThumbnail;
    private final String thumbnail;
    private final String small;
    private final String medium;
    private final String large;
    private final String extraLarge;

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
}
