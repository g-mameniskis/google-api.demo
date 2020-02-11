package com.example.apidemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private java.lang.String quote;

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

    public java.lang.String getQuote() {
        return this.quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(java.lang.String quote) {
        this.quote = quote;
    }

    @Override
    public java.lang.String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}
