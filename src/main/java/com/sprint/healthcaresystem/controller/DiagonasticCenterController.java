package com.sprint.healthcaresystem.controller;

import com.sprint.healthcaresystem.model.DiagnosticCenter;
import com.sprint.healthcaresystem.service.DiagnosticCenterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/DiagnosticCenter")
class DiagnosticCenterController {
    @Autowired
    private DiagnosticCenterService diagnosticCenterService;

    @PostMapping("/add")
    public ResponseEntity<DiagnosticCenter> add(@RequestBody DiagnosticCenter diagnosticCenter)
    {
        return ResponseEntity.ok(this.diagnosticCenterService.addDiagnosticCenter(diagnosticCenter));
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAllDiagnosticCenters()
    {
        return ResponseEntity.ok(this.diagnosticCenterService.getAllDiagnosticCenters());

    }

    @GetMapping("/getbyid/{id}")
    public DiagnosticCenter fetchById(@PathVariable Integer id) {
        return diagnosticCenterService.getDiagnosticCenterById(id);
    }

}