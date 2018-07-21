package com.szczudlinski.dawid.simulationNumberGenerator.simulationNumberGenerator.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "number_generator")
public class NumberGenerator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;
}
