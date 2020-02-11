package com.example.apidemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

//    private String type;
    private java.lang.String kind;
//    private Value value;
    private Value items;

    public Quote() {
    }

    public java.lang.String getKind() {
        return kind;
    }

    public void setKind(java.lang.String kind) {
        this.kind = kind;
    }

    public Value getItems() {
        return items;
    }

    public void setItems(Value items) {
        this.items = items;
    }

    @Override
    public java.lang.String toString() {
        return "Quote{" +
                "type='" + kind + '\'' +
                ", value=" + items +
                '}';
    }
}
