package com.example.series_library_java.domain.model;

import java.util.Date;
import java.util.UUID;

public class Progress {
    private UUID uuid;
    private int chapter;
    private String resume;
    private Date date;
    private User user;
    private Series series;

    public Progress(UUID uuid, int chapter, String resume, Date date, User user, Series series) {
        this.uuid = uuid;
        this.chapter = chapter;
        this.resume = resume;
        this.date = date;
        this.user = user;
        this.series = series;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }
}
