package com.zaretmir.catalog.services;

import com.zaretmir.catalog.models.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAll();
    List<Course> getAllActive();
    Course getById(Long id);
    Course getByIdWithInstructor(Long id);
    Course add(Course course);

}
