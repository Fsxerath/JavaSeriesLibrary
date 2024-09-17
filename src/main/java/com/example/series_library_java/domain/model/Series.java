package com.example.series_library_java.domain.model;

import java.util.List;
import java.util.UUID;

public class Series {
    private UUID id;
    private String title;
    private String synopsis;
    private String publicationDate;
    private int totalChapters;
    private String thumbnail;
    private TypeSeries type;
    private List<Progress> progress;

    public Series(UUID id, String title, String synopsis, String publicationDate, int totalChapters, String thumbnail, TypeSeries type, List<Progress> progress) {
        this.id = id;
        this.title = title;
        this.synopsis = synopsis;
        this.publicationDate = publicationDate;
        this.totalChapters = totalChapters;
        this.thumbnail = thumbnail;
        this.type = type;
        this.progress = progress;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getTotalChapters() {
        return totalChapters;
    }

    public void setTotalChapters(int totalChapters) {
        this.totalChapters = totalChapters;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public TypeSeries getType() {
        return type;
    }

    public void setType(TypeSeries type) {
        this.type = type;
    }

    public List<Progress> getProgress() {
        return progress;
    }

    public void setProgress(List<Progress> progress) {
        this.progress = progress;
    }
}
