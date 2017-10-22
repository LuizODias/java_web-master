package com.example.demo.controller;

import com.example.demo.model.Training;
import com.example.demo.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/training")
public class TrainingController {

    private TrainingService trainingService;

    @Autowired
    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;

    }

    @GetMapping(produces = "application/json")
    public List<Training> findAll() {
        return trainingService.findAll();
    }

    @PostMapping(value = "/save", produces = "application/json")
    public ResponseEntity<Training> saveTraining(@RequestBody Training training) {
        return ResponseEntity.status(HttpStatus.OK).body(trainingService.saveTraining(training));
    }
}
