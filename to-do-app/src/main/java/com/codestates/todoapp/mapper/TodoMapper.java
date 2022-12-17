package com.codestates.todoapp.mapper;

import com.codestates.todoapp.dto.TodoDto;
import com.codestates.todoapp.entity.Todos;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    Todos postDtoToTodo(TodoDto.Post requestBody);
    Todos patchDtoToTodo(TodoDto.Patch requestBody);
    TodoDto.Response todoToResponseDto(Todos todos);
}
