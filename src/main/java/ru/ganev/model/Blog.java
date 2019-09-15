package ru.ganev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "BLOG")
public class Blog implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int year;

    protected Blog() {
    }

    public Blog(String name, int year) {
        this.title = name;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }


}
