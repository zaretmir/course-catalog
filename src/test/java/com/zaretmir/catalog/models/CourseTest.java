package com.zaretmir.catalog.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CourseTest {

    @InjectMocks
    Course course;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSetId(){
        Long idValue = 1L;
        course.setId(idValue);
        assertEquals(course.getId(), idValue);
    }

    @Test
    void testSetTitle(){
        String titleValue = "title value";
        course.setTitle(titleValue);
        assertEquals(course.getTitle(), titleValue);
    }

    @Test
    void testSetDuration(){
        Integer durationValue = 123;
        course.setDuration(durationValue);
        assertEquals(course.getDuration(), durationValue);
    }

    @Test
    void testSetLevel(){
        String levelValue = "level";
        course.setLevel(levelValue);
        assertEquals(course.getLevel(), levelValue);
    }

    @Test
    void testSetIsActive(){
        Boolean boolValue = true;
        course.setIsActive(boolValue);
        assertEquals(course.getIsActive(), boolValue);
    }

    @Test
    void testSetInstructor(){
        course.setInstructor(new Instructor());
    }
}