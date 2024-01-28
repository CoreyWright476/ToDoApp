package com.app.todo.models;

import java.util.UUID;

public class TodoModel {

    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    private String Title;
    private int date;
    private String Description;

    @Override
    public String toString() {
        return "TodoModel{" +
                "id=" + id +
                ", Title='" + Title + '\'' +
                ", date=" + date +
                ", Description='" + Description + '\'' +
                '}';
    }
}
