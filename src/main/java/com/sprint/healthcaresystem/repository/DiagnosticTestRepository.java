package com.sprint.healthcaresystem.repository;

import com.sprint.healthcaresystem.model.DiagnosticTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosticTestRepository extends JpaRepository<DiagnosticTest,Integer> {

}
