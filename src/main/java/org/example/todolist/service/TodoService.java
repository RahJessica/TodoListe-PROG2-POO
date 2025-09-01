package org.example.todolist.service;

import org.example.todolist.entity.Todo;
import org.example.todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> getAll() {
        return repository.findAll();
    }

    public Todo getById(Integer id) {
        Optional<Todo> todo = repository.findById(id);
        return todo.orElse(null);
    }

    public Todo save(Todo todo) {
        return repository.save(todo);
    }

    public Todo update(Integer id, Todo updatedTodo) {
        return repository.findById(id)
                .map(todo -> {
                    todo.setTitle(updatedTodo.getTitle());
                    todo.setDescription(updatedTodo.getDescription());
                    todo.setStartDateTime(updatedTodo.getStartDateTime());
                    todo.setEndDateTime(updatedTodo.getEndDateTime());
                    todo.setDone(updatedTodo.isDone());
                    return repository.save(todo);
                })
                .orElse(null);
    }

    public boolean delete(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}