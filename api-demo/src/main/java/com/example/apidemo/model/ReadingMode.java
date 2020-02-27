package com.example.apidemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReadingMode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Boolean text;
    private Boolean image;

    public ReadingMode() {
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
