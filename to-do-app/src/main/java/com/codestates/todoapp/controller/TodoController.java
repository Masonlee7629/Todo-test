package com.codestates.todoapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TodoController {

    @PostMapping
    public ResponseEntity postTodo() {
        return new ResponseEntity<>();
    }

    @PatchMapping("/{id}")
    public ResponseEntity patchTodo() {
        return new ResponseEntity<>();
    }

    @GetMapping("/{id}")
    public ResponseEntity getTodo() {
        return new ResponseEntity<>();
    }

    @GetMapping
    public ResponseEntity getTodos() {
        return new ResponseEntity<>();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTodo() {
        return new ResponseEntity<>();
    }

    @DeleteMapping
    public ResponseEntity deleteTodos() {
        return new ResponseEntity<>();
    }
}
