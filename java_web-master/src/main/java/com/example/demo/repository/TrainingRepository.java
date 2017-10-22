package com.example.demo.repository;

import com.example.demo.model.Training;
import com.example.demo.model.enums.TrainingStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TrainingRepository extends JpaRepository<Training, Long>, JpaSpecificationExecutor {

    List<Training> findAllByStatusEquals(TrainingStatus status);
    List<Training> findAll();
    Training save(Training training);
    Training findOne(Long id);
}
