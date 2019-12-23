package com.zaretmir.catalog.services;

import com.zaretmir.catalog.dao.CourseMapper;
import com.zaretmir.catalog.models.Course;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
class CourseServiceImplTest {
    @Mock
    CourseMapper courseMapper;
    @InjectMocks
    CourseServiceImpl courseServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

    }

    @Test
    void testGetAll(){
        when(courseMapper.getAll()).thenReturn(Arrays.<Course>asList(new Course("title", Integer.valueOf(0), Boolean.TRUE)));

        List<Course> result = courseServiceImpl.getAll();
        Assertions.assertEquals(Arrays.<Course>asList(new Course("title", Integer.valueOf(0), Boolean.TRUE)), result);
    }

    @Test
    void testGetAllActive(){
        when(courseMapper.getAllActive()).thenReturn(Arrays.<Course>asList(new Course("title", Integer.valueOf(0), Boolean.TRUE)));

        List<Course> result = courseServiceImpl.getAllActive();
        Assertions.assertEquals(Arrays.<Course>asList(new Course("title", Integer.valueOf(0), Boolean.TRUE)), result);
    }

    @Test
    void testGetById(){
        when(courseMapper.getById(anyLong())).thenReturn(new Course("title", Integer.valueOf(0), Boolean.TRUE));

        Course result = courseServiceImpl.getById(Long.valueOf(1));
        Assertions.assertEquals(new Course("title", Integer.valueOf(0), Boolean.TRUE), result);
    }

    @Test
    void testGetByIdWithInstructor(){
        when(courseMapper.getByIdWithInstructor(anyLong())).thenReturn(new Course("title", Integer.valueOf(0), Boolean.TRUE));

        Course result = courseServiceImpl.getByIdWithInstructor(Long.valueOf(1));
        Assertions.assertEquals(new Course("title", Integer.valueOf(0), Boolean.TRUE), result);
    }

    @Test
    void testAdd(){
        when(courseMapper.add(any())).thenReturn(new Course("title", Integer.valueOf(0), Boolean.TRUE));

        Course result = courseServiceImpl.add(new Course("title", Integer.valueOf(0), Boolean.TRUE));
        Assertions.assertEquals(new Course("title", Integer.valueOf(0), Boolean.TRUE), result);
    }
}