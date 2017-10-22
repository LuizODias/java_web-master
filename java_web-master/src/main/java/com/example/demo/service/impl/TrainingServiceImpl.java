package com.example.demo.service.impl;

import com.example.demo.model.Training;
import com.example.demo.model.enums.TrainingStatus;
import com.example.demo.repository.TrainingRepository;
import com.example.demo.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {

    private TrainingRepository trainingRepository;

    @Autowired
    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public List<Training> findAllByStatusEquals(TrainingStatus status) {
        return trainingRepository.findAllByStatusEquals(status);
    }

    @Override
    public List<Training> findAll() {
        return trainingRepository.findAll();
    }

    @Override
    public Training saveTraining(Training training) {
        return trainingRepository.save(training);
    }

    @Override
    public Training findOne(Long id) {
        return trainingRepository.findOne(id);
    }
}
