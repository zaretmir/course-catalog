package com.zaretmir.catalog.controllers;

import com.zaretmir.catalog.dao.CourseMapper;
import com.zaretmir.catalog.models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course-management")
public class CourseController {

    @Autowired
    private CourseMapper courseMapper;

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(courseMapper.getAll(), HttpStatus.OK);
    }

    @GetMapping("/courses/{id}")
    public ResponseEntity<Course> getCourse(@PathVariable("id") Long id){
        return new ResponseEntity<>(courseMapper.getByIdWithInstructor(id), HttpStatus.OK);
    }

    // TODO retrieve object (not mock)
    @PostMapping("/courses")
    public ResponseEntity<Course> addCourse(){
        Course course = new Course("MySQL Workbench Intro", 4, true);
        return new ResponseEntity<>(courseMapper.add(course), HttpStatus.OK);
    }
}
