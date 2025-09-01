// JpaRepository : interface permettant d'hériter des méthodes utiles pour les manip de bases de données comme:
// findAll(), save(), findById(), deleteById(), count(), existsById()
package org.example.todolist.repository;

import org.example.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}