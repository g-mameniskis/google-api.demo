package com.example.apidemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SaleInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String country;
    private String saleability;
    private Boolean isEbook;

    public SaleInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSaleability() {
        return saleability;
    }

    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    public Boolean getEbook() {
        return isEbook;
    }

    public void setEbook(Boolean ebook) {
        isEbook = ebook;
    }

    @Override
    public String toString() {
        return "SaleInfo{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", saleability='" + saleability + '\'' +
                ", isEbook=" + isEbook +
                '}';
    }
}
