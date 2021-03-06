package com.sprint.healthcaresystem.model;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer patientid;
    @Size(min=2 , max=20)
    @NotNull(message="Please enter your name")
    private String name;
    @Size(min=2 , max=20)
    @NotNull(message ="Please enter your phone number")
    private String phoneNo;

    @NotNull(message="Please enter your age")
    private Integer age;

    @NotNull(message="Please enter the gender")
    private String gender;

    @OneToOne(targetEntity = Appointment.class, cascade = CascadeType.ALL)
    @JoinColumn(name ="", referencedColumnName = "id")
    private List<Appointment> AppointmentList;
}
