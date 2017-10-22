package com.example.demo.model;

import com.example.demo.model.enums.TrainingStatus;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TRAINING")
public class Training implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TRAINING_ID")
    private Long id;

    @NotNull
    @Column(name = "TRAINING_NAME", length = 50)
    private String name;

    @NotNull
    @Column(name = "TRAINING_DATE")
    private Date date;

    @Column(name = "TRAINING_LOCAL", length = 30)
    private String local;

    @NotNull
    @Column(name = "TRAINING_DURATION", length = 4)
    private String duration;

    @Column(name = "TRAINING_TARGET")
    private String target;

    @NotNull
    @Column(name = "TRAINING_AVAILABLE")
    private Integer available;

    @Column(name = "TRAINING_STATUS")
    private TrainingStatus status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "INSTRUCTOR_ID")
    private Instructor instructor;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public TrainingStatus getActive() {
        return status;
    }

    public void setActive(TrainingStatus status) {
        this.status = status;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
