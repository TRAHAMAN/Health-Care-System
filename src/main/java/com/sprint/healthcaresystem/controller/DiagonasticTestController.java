package com.sprint.healthcaresystem.controller;

import com.sprint.healthcaresystem.model.DiagnosticTest;
import com.sprint.healthcaresystem.service.DiagnosticTestService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

    @Slf4j
    @RestController
    @RequestMapping("DiagnosticTest")
    class DiagnosticTestController {
        @Autowired
        private DiagnosticTestService diagnosticTestService;

        @ApiOperation("Get all the test")
        @GetMapping("/getall")

        public List<DiagnosticTest> getAllTest(){
            log.info("Fetch all the tests");
            return diagnosticTestService.getAllTest();
        }

        @ApiOperation("Add new Test")
        @PostMapping("/addtest")
        public ResponseEntity<DiagnosticTest> addNewTest(@Valid @RequestBody DiagnosticTest test){
            DiagnosticTest newTest = diagnosticTestService.addNewTest(test);
            log.info("Added new test");
            return new ResponseEntity<>(newTest, HttpStatus.CREATED);
        }

        @ApiOperation("")
        @GetMapping("/gettestofdiagnosticcenter")
        public DiagnosticTest getTestOfDiagnosticCenter(@PathVariable int centerId){

            return null;
        }

        @ApiOperation("Update test")
        @PutMapping("/updatetest")
        public ResponseEntity<DiagnosticTest> updateTestDetails(@Valid @RequestBody DiagnosticTest test){

            return null;
        }

        @ApiOperation("Remove test from diagnostic center")
        @DeleteMapping("/removetest")
        public ResponseEntity<DiagnosticTest> removeTestFormDiagnosticCenter(@Valid @RequestBody DiagnosticTest test){

            return null;
        }

    }

