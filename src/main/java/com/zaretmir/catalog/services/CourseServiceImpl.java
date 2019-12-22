package com.zaretmir.catalog.services;

import com.zaretmir.catalog.dao.CourseMapper;
import com.zaretmir.catalog.models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> getAll() {
        return courseMapper.getAll();
    }

    @Override
    public List<Course> getAllActive() {
        return courseMapper.getAllActive();
    }

    @Override
    public Course getById(Long id) {
        return courseMapper.getById(id);
    }

    @Override
    public Course getByIdWithInstructor(Long id) {
        return courseMapper.getByIdWithInstructor(id);
    }

    @Override
    public Course add(Course course) {
        return courseMapper.add(course);
    }
}
