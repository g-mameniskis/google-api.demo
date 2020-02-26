package com.example.apidemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashMap;

@Entity
public class AccessInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String country;
    private String viewability;
    private Boolean embeddable;
    private Boolean publicDomain;
    private String textToSpeechPermission;
    private HashMap<String, Boolean> epub;
    private HashMap<String, Boolean> pdf;
    private String webReaderLink;
    private String accessViewStatus;
    private Boolean quoteSharingAllowed;

    public AccessInfo() {
    }

    @Override
    public String toString() {
        return "AccessInfo{" +
                "country='" + country + '\'' +
                ", viewability='" + viewability + '\'' +
                ", embeddable=" + embeddable +
                ", publicDomain=" + publicDomain +
                ", textToSpeechPermission='" + textToSpeechPermission + '\'' +
                ", epub=" + epub +
                ", pdf=" + pdf +
                ", webReaderLink='" + webReaderLink + '\'' +
                ", accessViewStatus='" + accessViewStatus + '\'' +
                ", quoteSharingAllowed=" + quoteSharingAllowed +
                '}';
    }
}
