package com.example.demo.service;

import com.example.demo.model.Instructor;

import java.util.List;

public interface InstructorService {

    List<Instructor> findAll();
    Instructor save(Instructor instructor);
    Instructor findOne(Long id);
}
