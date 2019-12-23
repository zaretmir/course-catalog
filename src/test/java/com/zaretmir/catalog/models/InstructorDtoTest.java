package com.zaretmir.catalog.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InstructorDtoTest {

    @InjectMocks
    InstructorDto instructorDto;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSetId(){
        Long idValue = 2L;
        instructorDto.setId(idValue);
        assertEquals(instructorDto.getId(), idValue);
    }

    @Test
    void testSetName(){
        String nameValue = "mock name";
        instructorDto.setName(nameValue);
        assertEquals(instructorDto.getName(), nameValue);
    }
}