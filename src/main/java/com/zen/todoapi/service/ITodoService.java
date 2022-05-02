package com.zen.todoapi.service;

import com.zen.todoapi.entity.Todo;

import java.util.List;

public interface ITodoService {
    List<Todo> getTodos();
    Todo saveTodo(Todo todo);
    Todo updateTodo(Todo todo);
    Boolean deleteTodo(Long id);
}
