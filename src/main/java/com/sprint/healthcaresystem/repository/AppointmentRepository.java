package com.sprint.healthcaresystem.repository;


import com.sprint.healthcaresystem.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository <Appointment,Integer> {

}
