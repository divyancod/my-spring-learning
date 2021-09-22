package com.spring.mytodoapp.service;

import com.spring.mytodoapp.model.TodoEntity;

import java.util.List;

public interface TodoService {
    void addTodo(TodoEntity todoEntity);
    void deleteTodo(int id);
    void markComplete(int id);
    List<TodoEntity> fetchAllTodos();
    TodoEntity getTodo(int id);
}
