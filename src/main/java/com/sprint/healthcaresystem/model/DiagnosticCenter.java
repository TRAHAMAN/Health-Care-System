package com.sprint.healthcaresystem.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
@NoArgsConstructor
@Table(name="DiagnosticCenter")
public class DiagnosticCenter {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer id;
    @NotNull(message = "Please Enter Diagnostic Center Name:")
    private String name;
    @NotNull(message = "Please Enter Diagnostic Center Contact Number:")
    private String contactNo;
    @NotNull(message = "Please Enter Diagnostic Center Address:")
    private String address;
    @NotNull(message = "Please Enter Diagnostic Center Email:")
    private String email;

    //@NotNull(message = "Please Enter Services Offered:")
    @ElementCollection
    private List<String> servicesOffered;

    //@NotNull(message = "Please Enter Diagnostic Tests:")
    @OneToMany(targetEntity = DiagnosticTest.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ct_fk", referencedColumnName = "id")
    private Set<DiagnosticTest> tests;
}