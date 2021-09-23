package com.sprint.healthcaresystem.service;

import com.sprint.healthcaresystem.model.Patient;
import com.sprint.healthcaresystem.model.TestResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    public List<Patient> getAll();

    public Patient registerPatient(Patient patient);
    void updatePatientDetails(int id,Patient patient);
    public Patient viewPatient(int id);
    public Patient getAllTestResult(String patientUserName);
    public Patient viewTestResult(int testResultId);



}
