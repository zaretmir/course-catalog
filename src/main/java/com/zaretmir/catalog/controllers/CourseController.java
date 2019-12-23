package com.zaretmir.catalog.controllers;

import com.zaretmir.catalog.models.Course;
import com.zaretmir.catalog.models.CourseDto;
import com.zaretmir.catalog.services.CourseService;
import com.zaretmir.catalog.utils.CourseAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/course-management")
@CrossOrigin
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public ResponseEntity<List<CourseDto>> getAllCourses(){
        List<CourseDto> courses = courseService.getAll()
                .stream().map(CourseAdapter::toDto).collect(Collectors.toList());
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @GetMapping("/courses/{id}")
    public ResponseEntity<CourseDto> getCourse(@PathVariable("id") Long id){
        CourseDto course = CourseAdapter.toDto(courseService.getByIdWithInstructor(id));
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @PostMapping("/courses")
    public ResponseEntity<Course> addCourse(@Valid @RequestBody CourseDto dto){
        Course course = CourseAdapter.toEntity(dto);
        return new ResponseEntity<>(courseService.add(course), HttpStatus.OK);
    }
}
