package com.example.apidemo.model;

public class ReadingModes {

    private Boolean text;
    private Boolean image;

    public ReadingModes() {
    }

    public Boolean getText() {
        return text;
    }

    public void setText(Boolean text) {
        this.text = text;
    }

    public Boolean getImage() {
        return image;
    }

    public void setImage(Boolean image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ReadingModes{" +
                "text=" + text +
                ", image=" + image +
                '}';
    }
}
