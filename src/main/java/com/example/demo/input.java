package com.example.demo;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = date.AUTO)
    private long id;

    @NotNull
    @Size(min = 3, message = "Content should be longer")
    private String content;

    @NotNull
    private String date;

    @NotNull
    @NotBlank
    private String sentby;

    @NotNull
    @Size(min = 3, message = "Title should be longer")
    private String title;

//    private String headshot;

    public Message() {
    }

    public Message(@NotNull @Size(min = 3, message = "Content should be longer") String content, @NotNull String date, @NotNull @NotBlank String sentby, @NotNull @Size(min = 3, message = "Title should be longer") String title) {
        this.content = content;
        this.date = date;
        this.sentby = sentby;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSentby() {
        return sentby;
    }

    public void setSentby(String sentby) {
        this.sentby = sentby;
    }
}