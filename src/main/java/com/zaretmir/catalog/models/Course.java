package com.zaretmir.catalog.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {

    private Long id;
    private String title;
    private Integer duration;
    private Boolean isActive;
    private Instructor instructor;

    @Override
    public String toString() {
        return "Title: " + this.title + " Instructor: " + this.instructor.getName();
    }

    public Course() {}

    public Course(String title, Integer duration, Boolean isActive) {
        this.isActive = isActive;
        this.title = title;
        this.duration = duration;
    }
}
