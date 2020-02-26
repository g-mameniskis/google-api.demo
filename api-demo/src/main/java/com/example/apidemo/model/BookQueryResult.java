package com.example.apidemo.model;

import com.example.apidemo.utils.Jsonifier;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
public class BookQueryResult {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String kind;
    private Integer totalItems;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToMany(targetEntity = BookQueryResult.class)
    private List<Book> items;

    public BookQueryResult() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public List<Book> getItems() {
        return items;
    }

    public void setItems(List<Book> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return Jsonifier.toJson(this);

//        return "BookQuery{" +
//                "id=" + id +
//                ", kind='" + kind + '\'' +
//                ", totalItems=" + totalItems +
//                ", items=" + items +
//                '}';
    }
}
