package com.sprint.healthcaresystem.service;

import com.sprint.healthcaresystem.model.Appointment;
import com.sprint.healthcaresystem.model.DiagnosticCenter;
import com.sprint.healthcaresystem.model.DiagnosticTest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DiagnosticCenterService {

    public List<DiagnosticCenter> getAllDiagnosticCenters();

    public DiagnosticCenter addDiagnosticCenter( DiagnosticCenter diagnosticCenter);

    public DiagnosticCenter getDiagnosticCenterById( Integer diagnosticCenterId);

    public DiagnosticCenter updateDiagnosticCenter( DiagnosticCenter diagnosticCenter);

    public DiagnosticTest viewTestDetails( Integer diagnosticCenterId, String testName);

    public DiagnosticTest addTest( Integer diagnosticCenterId, Integer testId);

    public DiagnosticCenter getDiagnosticCenter( String centerName);

    public DiagnosticCenter removeDiagnosticCenter( Integer id);

    public List<Appointment> getListOfAppointments(String centerName);

}
