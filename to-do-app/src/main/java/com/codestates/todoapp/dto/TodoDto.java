package com.codestates.todoapp.dto;

import javax.validation.constraints.NotBlank;

public class TodoDto {
    public static class Post {
        @NotBlank
        private String title;

        @NotBlank
        private Integer todo_order;

        @NotBlank
        private Boolean completed;
    }

    public static class Patch {
        private Integer id;
        private String title;
        private Integer todo_order;
        private Boolean completed;

        public void setId(Integer id) {
            this.id = id;
        }
    }

    public static class Response {
        private Integer id;
        private String title;
        private Integer todo_order;
        private Boolean completed;
    }
}
