package org.example.todolist.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor          // Constructeur vide pour JPA
@AllArgsConstructor         // Constructeur avec tous les champs
@ToString
@EqualsAndHashCode
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrément
    private Integer id;

    private String title;
    private String description;
    private Instant startDateTime;
    private Instant endDateTime;
    private boolean done;
}