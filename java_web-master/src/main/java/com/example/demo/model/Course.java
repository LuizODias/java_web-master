package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "COURSE")
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COURSE_ID")
    private Long id;

    @NotNull
    @Column(name = "COURSE_NAME", length = 40)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TRAINING_ID")
    private Training training;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }
}
