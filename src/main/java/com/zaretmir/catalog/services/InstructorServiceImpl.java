package com.zaretmir.catalog.services;

import com.zaretmir.catalog.dao.InstructorMapper;
import com.zaretmir.catalog.exception.ApplicationException;
import com.zaretmir.catalog.exception.InstructorExceptionCause;
import com.zaretmir.catalog.models.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {

    @Autowired
    private InstructorMapper instructorMapper;

    @Override
    public List<Instructor> getAll() {

        List<Instructor> instructors = instructorMapper.getAll();
        if (instructors.isEmpty()) {
            throw new ApplicationException(InstructorExceptionCause.NOT_FOUND);
        }

        return instructors;
    }
}
