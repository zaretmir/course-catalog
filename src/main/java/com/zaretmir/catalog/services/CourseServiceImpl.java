package com.zaretmir.catalog.services;

import com.zaretmir.catalog.dao.CourseMapper;
import com.zaretmir.catalog.exception.ApplicationException;
import com.zaretmir.catalog.exception.CourseExceptionCause;
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
        List<Course> courses = courseMapper.getAll();

        if (courses.isEmpty()) {
            throw new ApplicationException(CourseExceptionCause.NOT_FOUND);
        }
        return courses;
    }

    @Override
    public List<Course> getAllActive() {
        List<Course> courses = courseMapper.getAllActive();
        if (courses.isEmpty()) {
            throw new ApplicationException(CourseExceptionCause.NOT_FOUND);
        }

        return courses;
    }

    @Override
    public Course getById(Long id) {
        Course course = courseMapper.getById(id);
        if (course == null) {
            throw  new ApplicationException(CourseExceptionCause.NOT_FOUND);
        }

        return course;
    }

    @Override
    public Course getByIdWithInstructor(Long id) {
        Course course = courseMapper.getByIdWithInstructor(id);
        if (course == null) {
            throw  new ApplicationException(CourseExceptionCause.NOT_FOUND);
        }

        return course;
    }

    @Override
    public Course add(Course course) {
        return courseMapper.add(course);
    }
}
