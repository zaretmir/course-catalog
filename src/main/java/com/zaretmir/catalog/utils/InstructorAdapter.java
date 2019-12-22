package com.zaretmir.catalog.utils;

import com.zaretmir.catalog.models.Instructor;
import com.zaretmir.catalog.models.InstructorDto;

public class InstructorAdapter {

    public static InstructorDto toDto(Instructor entity) {
        InstructorDto dto = new InstructorDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }
}
