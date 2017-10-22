package com.example.demo.controller;

import com.example.demo.model.Instructor;
import com.example.demo.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

    private InstructorService instructorService;

    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping(produces = "application/json")
    public List<Instructor> findAllInstructors() {
        return instructorService.findAll();
    }

    @PostMapping(value = "/save", produces = "application/json")
    public ResponseEntity<Instructor> saveInstructor(@RequestBody Instructor instructor) {
        return ResponseEntity.status(HttpStatus.OK).body(instructorService.save(instructor));
    }
}
