package com.example.demo.service;

import com.example.demo.model.Training;
import com.example.demo.model.enums.TrainingStatus;

import java.util.List;

public interface TrainingService {

    List<Training> findAllByStatusEquals(TrainingStatus status);
    List<Training> findAll();
    Training saveTraining(Training training);
    Training findOne(Long id);
}
