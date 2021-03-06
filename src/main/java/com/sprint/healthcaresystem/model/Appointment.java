package com.sprint.healthcaresystem.model;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull(message="Please enter your appointment date")
    private LocalDate date;

    @NotNull(message="Please enter the approval status")
    private boolean approvalStatus;

    @OneToOne(targetEntity = DiagnosticTest.class, cascade = CascadeType.ALL)
    @JoinColumn (name = "diat_apmt", referencedColumnName = "id")
    private Set<DiagnosticTest> diagnosticTests;

    @OneToMany(targetEntity = Patient.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pat_apmt", referencedColumnName = "id")
    private Set<Patient> patient;

    @OneToMany(targetEntity = DiagnosticCenter.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "diac_apmt", referencedColumnName = "id")
    private Set<Patient> diagnosticCenter;


    @OneToMany(targetEntity = TestResult.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "test_apmt", referencedColumnName = "id")
    private Set<TestResult> testResults;

}
