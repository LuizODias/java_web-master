package com.example.demo.repository;

import com.example.demo.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface InstructorRepository extends JpaRepository<Instructor, Long>, JpaSpecificationExecutor {

    List<Instructor> findAll();
    Instructor save(Instructor instructor);
    Instructor findOne(Long id);
}
