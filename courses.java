package com.FirstRestApi.FirstRestApi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class courses {
    @Id
    private long id;
    private String title;
    private String description;

    public courses(long id, String title, String description) {
        this.id= id;
        this.title = title;
        this.description = description;
    }

    public courses() {
        super();
    }

    public   long getId() {
        return id;
    }

    public  void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
