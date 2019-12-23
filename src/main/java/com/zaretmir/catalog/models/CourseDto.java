package com.zaretmir.catalog.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CourseDto {

    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    @Min(value = 0, message = "duration must be a positive integer")
    private Integer duration;

    @NotBlank(message = "Level is required")
    private String level;

    @NotNull(message = "Active status is required")
    private Boolean isActive;

    @NotNull(message = "Instructor is required")
    private Instructor instructor;
}
