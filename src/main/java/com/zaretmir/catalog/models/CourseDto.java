package com.zaretmir.catalog.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class CourseDto {

    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    @Min(value = 0, message = "duration must be a positive integer")
    private Integer duration;

    private Boolean isActive;

    private Instructor instructor;
}
