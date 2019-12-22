package com.zaretmir.catalog.controllers;

import com.zaretmir.catalog.models.Instructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/instructor-management")
public class InstructorController {

    // TODO implement (remove placeholder)
    @GetMapping("/instructors")
    public ResponseEntity<List<Instructor>> getAll() {
        List<Instructor> mockList = new ArrayList<>();
        return new ResponseEntity<>(mockList, HttpStatus.OK);
    }
}
