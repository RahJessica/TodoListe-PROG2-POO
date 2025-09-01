package org.example.todolist.service;

import org.example.todolist.entity.Todo;
import org.example.todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> getAll() {
        return repository.findAll();
    }

    public Todo save(Todo todo) {
        return repository.save(todo);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public Todo update(Todo todo) {
        return repository.save(todo);
    }
}