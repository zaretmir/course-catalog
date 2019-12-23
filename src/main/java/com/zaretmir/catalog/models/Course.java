package com.zaretmir.catalog.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"instructor"})
public class Course {

    private Long id;
    private String title;
    private Integer duration;
    private String level;
    private Boolean isActive;
    private Instructor instructor;

    public Course() {}

    public Course(String title, Integer duration, Boolean isActive) {
        this.isActive = isActive;
        this.title = title;
        this.duration = duration;
    }
}
