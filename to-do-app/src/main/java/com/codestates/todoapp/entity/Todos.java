package com.codestates.todoapp.entity;

import javax.persistence.*;

@Entity
public class Todos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Integer todo_order;

    @Column(nullable = false)
    private Boolean completed;
}
