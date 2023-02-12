package com.example.blog.models;

import javax.persistence.*;

@Entity
@Table(name = "POST1")
public class Post {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "anons")
    private String anons;

    @Column(name = "full_text", nullable = false)
    private String fullText;

    @Column(name = "views", columnDefinition = "varchar(128)")
    private int views;

    public Post() {
    }

    public Post(String title, String anons, String fullText) {
        this.title = title;
        this.anons = anons;
        this.fullText = fullText;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAnons() {
        return anons;
    }

    public String getFullText() {
        return fullText;
    }

    public int getViews() {
        return views;
    }
}
