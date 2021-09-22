package com.spring.mytodoapp.dao;

import com.spring.mytodoapp.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity,Integer> {
    @Modifying
    @Transactional
    @Query(value = "update todolist set completed = !completed where ID=:id",nativeQuery = true)
    void flipTodo(@Param("id")int id);
}
