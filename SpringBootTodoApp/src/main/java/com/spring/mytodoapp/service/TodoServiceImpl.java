package com.spring.mytodoapp.service;

import com.spring.mytodoapp.dao.TodoRepository;
import com.spring.mytodoapp.model.TodoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    TodoRepository todoRepository;

    @Override
    public void addTodo(TodoEntity todoEntity) {
        todoEntity.setCompleted("0");
        todoRepository.save(todoEntity);
    }

    @Override
    public void deleteTodo(int id) {
        todoRepository.deleteById(id);
    }

    @Override
    public void markComplete(int id) {
        todoRepository.flipTodo(id);
    }

    @Override
    public List<TodoEntity> fetchAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public TodoEntity getTodo(int id) {
        Optional<TodoEntity> todoEntity = todoRepository.findById(id);
        return todoEntity.orElse(null);
    }

}
