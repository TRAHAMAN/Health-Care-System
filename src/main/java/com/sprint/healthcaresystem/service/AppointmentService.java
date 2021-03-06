package com.sprint.healthcaresystem.service;

import com.sprint.healthcaresystem.model.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
@Service

public interface AppointmentService {
    public Appointment addAppointment(Appointment appointment);

    public Set<Appointment>  viewAppointments(String patientName);

    public Optional<Appointment> viewAppointment(int Appointment);

    public Appointment updateAppointment(Appointment appointment);

    public List<Appointment> getAppointmentList(int centreid,String test,int status);

    public Appointment removeAppointment(Appointment appointment);


}
