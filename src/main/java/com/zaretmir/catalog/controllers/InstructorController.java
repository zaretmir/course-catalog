package com.zaretmir.catalog.controllers;

import com.zaretmir.catalog.models.Instructor;
import com.zaretmir.catalog.models.InstructorDto;
import com.zaretmir.catalog.services.InstructorService;
import com.zaretmir.catalog.utils.InstructorAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/instructor-management")
@CrossOrigin
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @GetMapping("/instructors")
    public ResponseEntity<List<InstructorDto>> getAll() {
        List<InstructorDto> instructors = instructorService.getAll().stream().map(InstructorAdapter::toDto).collect(Collectors.toList());
        return new ResponseEntity<>(instructors, HttpStatus.OK);
    }
}
