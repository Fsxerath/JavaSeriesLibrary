package com.example.series_library_java.domain.model;

import java.util.List;
import java.util.UUID;

public class User {
    private UUID id;
    private String username;
    private String password;
    private List<Progress> progress;

    public User(String username, String password, List<Progress> progress) {
        this.username = username;
        this.password = password;
        this.progress = progress;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Progress> getProgress() {
        return progress;
    }

    public void setProgress(List<Progress> progress) {
        this.progress = progress;
    }
}
