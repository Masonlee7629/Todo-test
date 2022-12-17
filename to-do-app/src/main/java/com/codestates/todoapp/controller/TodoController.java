package com.codestates.todoapp.controller;

import com.codestates.todoapp.dto.TodoDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/")
@Validated
public class TodoController {

    @PostMapping
    public ResponseEntity postTodo(@Valid @RequestBody TodoDto.Post requestBody) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity patchTodo(@PathVariable("id") @Positive int id,
                                    @RequestBody TodoDto.Patch requestBody) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getTodo(@PathVariable("id") @Positive int id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getTodos() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTodo(@PathVariable("id") @Positive int id) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    public ResponseEntity deleteTodos() {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
