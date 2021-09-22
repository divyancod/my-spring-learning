package com.spring.mytodoapp.contoller;

import com.spring.mytodoapp.service.TodoService;
import com.spring.mytodoapp.model.TodoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @Autowired
    TodoService todoService;

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("todos", todoService.fetchAllTodos());
        return "index";
    }
    @GetMapping("/add-todo")
    public String addTodo(Model model)
    {
        model.addAttribute("newTodo",new TodoEntity());
        return "addtodo";
    }
    @PostMapping("/process-todo")
    public String processTodo(@ModelAttribute("todos")TodoEntity todoEntity)
    {
        todoService.addTodo(todoEntity);
        return "redirect:/";
    }
    @GetMapping("/toggle/{id}")
    public String toggleComplete(@PathVariable int id)
    {
        todoService.markComplete(id);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable int id)
    {
        todoService.deleteTodo(id);
        return "redirect:/";
    }

    @GetMapping("/update-todo/{id}")
    public String updateTodo(@PathVariable int id,Model model)
    {
        model.addAttribute("newTodo",todoService.getTodo(id));
        return "addtodo";
    }
}
