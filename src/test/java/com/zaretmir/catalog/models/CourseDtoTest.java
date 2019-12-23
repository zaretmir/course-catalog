package com.zaretmir.catalog.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseDtoTest {

    @InjectMocks
    CourseDto courseDto;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSetId(){
        Long idValue = 1L;
        courseDto.setId(idValue);
        assertEquals(courseDto.getId(), idValue);
    }

    @Test
    void testSetTitle(){
        String titleValue = "title value";
        courseDto.setTitle(titleValue);
        assertEquals(courseDto.getTitle(), titleValue);
    }

    @Test
    void testSetDuration(){
        Integer durationValue = 123;
        courseDto.setDuration(durationValue);
        assertEquals(courseDto.getDuration(), durationValue);
    }

    @Test
    void testSetLevel(){
        String levelValue = "level";
        courseDto.setLevel(levelValue);
        assertEquals(courseDto.getLevel(), levelValue);
    }

    @Test
    void testSetIsActive(){
        Boolean boolValue = true;
        courseDto.setIsActive(boolValue);
        assertEquals(courseDto.getIsActive(), boolValue);
    }

    @Test
    void testSetInstructor(){
        courseDto.setInstructor(new Instructor());
    }
}