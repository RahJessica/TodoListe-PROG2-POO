package org.example.todolist.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;
    private Instant startDateTime;
    private Instant endDateTime;
    private boolean done;

    // Constructeur vide pour JPA
    public Todo() {}

    // Constructeur avec tous les champs
    public Todo(Integer id, String title, String description, Instant startDateTime, Instant endDateTime, boolean done) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.done = done;
    }

    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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

    public Instant getStartDateTime() {
        return startDateTime;
    }
    public void setStartDateTime(Instant startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Instant getEndDateTime() {
        return endDateTime;
    }
    public void setEndDateTime(Instant endDateTime) {
        this.endDateTime = endDateTime;
    }

    public boolean isDone() {
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
}