package com.spring.mytodoapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "todolist")
public class TodoEntity {
    @Id
    private int ID;
    private String todo;
    private String completed;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "TodoEntity{" +
                "ID=" + ID +
                ", todo='" + todo + '\'' +
                ", completed='" + completed + '\'' +
                '}';
    }
}
