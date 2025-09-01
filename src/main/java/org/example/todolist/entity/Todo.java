package org.example.todolist.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@Entity
@Data               // @Entity signifie que la classe Todo représente une table dans la base de données (entité persistante)
@NoArgsConstructor  // Constructeur vide pour JPA
@AllArgsConstructor // Constructeur avec tous les champs
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;
    private Instant startDateTime;
    private Instant endDateTime;
    private boolean done;
}
