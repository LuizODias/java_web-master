package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(produces = "application/json")
    public List<Course> findAllCourses() {
        return courseService.findAll();
    }

    @PostMapping(value = "/save", produces = "application/json")
    public ResponseEntity<Course> saveCourse(@RequestBody Course course) {
        return ResponseEntity.status(HttpStatus.OK).body(courseService.save(course));
    }
}
