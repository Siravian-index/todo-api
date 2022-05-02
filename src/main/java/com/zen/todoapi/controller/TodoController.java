package com.zen.todoapi.controller;

import com.zen.todoapi.entity.Todo;
import com.zen.todoapi.service.TodoServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/todos")
//enable us to receive data from the frontend
@CrossOrigin(origins = "http://localhost:3000/")
public class TodoController {

    private final TodoServiceImplementation todoService;

    @Autowired
    public TodoController(TodoServiceImplementation todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getTodos();
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.saveTodo(todo);
    }

    @PutMapping
    public Todo updateTodo(@RequestBody Todo todo) {
        return todoService.updateTodo(todo);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteTodo(@PathVariable Long id) {
        return todoService.deleteTodo(id);
    }
}
