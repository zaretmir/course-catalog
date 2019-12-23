package com.zaretmir.catalog.utils;

import com.zaretmir.catalog.models.Course;
import com.zaretmir.catalog.models.CourseDto;

public class CourseAdapter {

    public static Course toEntity(CourseDto dto) {
        Course entity = new Course();
        entity.setId(dto.getId());
        entity.setTitle(dto.getTitle());
        entity.setDuration(dto.getDuration());
        entity.setLevel(dto.getLevel());
        entity.setIsActive(dto.getIsActive());
        entity.setInstructor(dto.getInstructor());

        return entity;
    }

    public static CourseDto toDto(Course entity) {
        CourseDto dto = new CourseDto();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setDuration(entity.getDuration());
        dto.setLevel(entity.getLevel());
        dto.setIsActive(entity.getIsActive());
        dto.setInstructor(entity.getInstructor());

        return dto;
    }
}
