package com.online.school.started.entites;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ImageLink {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String link;

    public Long getId() {
        return id;
    }

    public ImageLink setId(Long id) {
        this.id = id;
        return this;
    }

    public String getLink() {
        return link;
    }

    public ImageLink setLink(String link) {
        this.link = link;
        return this;
    }
}
