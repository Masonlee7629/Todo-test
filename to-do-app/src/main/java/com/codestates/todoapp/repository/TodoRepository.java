package com.codestates.todoapp.repository;

import com.codestates.todoapp.entity.Todos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todos, Integer> {
}
