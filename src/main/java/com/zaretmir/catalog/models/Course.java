package com.zaretmir.catalog.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {

    private Boolean isActive;
    private String title;
    private Integer duration;
    private Instructor instructor;
}
