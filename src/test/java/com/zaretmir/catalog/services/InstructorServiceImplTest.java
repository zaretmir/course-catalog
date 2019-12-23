package com.zaretmir.catalog.services;

import com.zaretmir.catalog.dao.InstructorMapper;
import com.zaretmir.catalog.models.Instructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
class InstructorServiceImplTest {
    @Mock
    InstructorMapper instructorMapper;
    @InjectMocks
    InstructorServiceImpl instructorServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetAll(){
        when(instructorMapper.getAll()).thenReturn(Arrays.<Instructor>asList(new Instructor()));

        List<Instructor> result = instructorServiceImpl.getAll();
        Assertions.assertEquals(Arrays.<Instructor>asList(new Instructor()), result);
    }
}