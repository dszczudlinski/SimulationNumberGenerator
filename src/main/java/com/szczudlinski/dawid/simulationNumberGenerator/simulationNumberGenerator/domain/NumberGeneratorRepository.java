package com.szczudlinski.dawid.simulationNumberGenerator.simulationNumberGenerator.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberGeneratorRepository extends JpaRepository<NumberGenerator, Long> {
}
