package ru.ganev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Career item model
 *
 * @author Artyom Ganev
 */
@Entity
@Table(name = "career")
public class Career implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Date date;

    @Column()
    private String link;

    @Column(name = "linkcaption")
    private String linkCaption;

    public Career(UUID id, String title, Date date, String link, String linkCaption) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.link = link;
        this.linkCaption = linkCaption;
    }

    public Career() {
    }
}
