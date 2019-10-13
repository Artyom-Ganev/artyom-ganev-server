package ru.ganev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

/**
 * Blog item model
 *
 * @author Artyom Ganev
 */
@Entity
@Table(name = "blog")
public class Blog implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int year;

    @Column(nullable = false)
    private int month;

    @Column(nullable = false)
    private int day;

    @Column()
    private String link;

    @Column()
    private String linkCaption;

    protected Blog() {
    }

    public Blog(String name, int year, int month, int day) {
        this.title = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLinkCaption() {
        return linkCaption;
    }

    public void setLinkCaption(String linkCaption) {
        this.linkCaption = linkCaption;
    }
}
