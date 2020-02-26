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
    @OneToOne(targetEntity = VolumeInfo.class)
    private ReadingModes readingModes;
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

    public VolumeInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public List<IndustryIdentifier> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public ReadingModes getReadingModes() {
        return readingModes;
    }

    public void setReadingModes(ReadingModes readingModes) {
        this.readingModes = readingModes;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public Integer getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Integer averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(Integer ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public String getMaturityRating() {
        return maturityRating;
    }

    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    public Boolean getAllowAnonLogging() {
        return allowAnonLogging;
    }

    public void setAllowAnonLogging(Boolean allowAnonLogging) {
        this.allowAnonLogging = allowAnonLogging;
    }

    public String getContentVersion() {
        return contentVersion;
    }

    public void setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
    }

    public HashMap<String, Boolean> getPanelizationSummary() {
        return panelizationSummary;
    }

    public void setPanelizationSummary(HashMap<String, Boolean> panelizationSummary) {
        this.panelizationSummary = panelizationSummary;
    }

    public HashMap<String, String> getImageLinks() {
        return imageLinks;
    }

    public void setImageLinks(HashMap<String, String> imageLinks) {
        this.imageLinks = imageLinks;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPreviewLink() {
        return previewLink;
    }

    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    public String getInfoLink() {
        return infoLink;
    }

    public void setInfoLink(String infoLink) {
        this.infoLink = infoLink;
    }

    public String getCanonicalVolumeLink() {
        return canonicalVolumeLink;
    }

    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
        this.canonicalVolumeLink = canonicalVolumeLink;
    }

    @Override
    public String toString() {
        return "VolumeInfo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", authors=" + authors +
                ", publisher='" + publisher + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", industryIdentifiers=" + industryIdentifiers +
                ", readingModes=" + readingModes +
                ", pageCount=" + pageCount +
                ", printType='" + printType + '\'' +
                ", averageRating=" + averageRating +
                ", ratingsCount=" + ratingsCount +
                ", maturityRating='" + maturityRating + '\'' +
                ", allowAnonLogging=" + allowAnonLogging +
                ", contentVersion='" + contentVersion + '\'' +
                ", panelizationSummary=" + panelizationSummary +
                ", imageLinks=" + imageLinks +
                ", language='" + language + '\'' +
                ", previewLink='" + previewLink + '\'' +
                ", infoLink='" + infoLink + '\'' +
                ", canonicalVolumeLink='" + canonicalVolumeLink + '\'' +
                '}';
    }
}