package com.example.demo.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEE_ID")
    private Long id;

    @NotNull
    @Column(name = "EMPLOYEE_NAME", length = 50)
    private String name;

    @NotNull
    @Column(name = "EMPLOYEE_CPF", unique = true, length = 11)
    private String cpf;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }
}
