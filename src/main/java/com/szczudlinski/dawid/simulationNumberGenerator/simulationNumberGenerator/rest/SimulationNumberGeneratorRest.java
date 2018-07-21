package com.szczudlinski.dawid.simulationNumberGenerator.simulationNumberGenerator.rest;

import com.szczudlinski.dawid.simulationNumberGenerator.simulationNumberGenerator.domain.NumberGenerator;
import com.szczudlinski.dawid.simulationNumberGenerator.simulationNumberGenerator.domain.NumberGeneratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "/simulationNumberGenerator", produces = MediaType.APPLICATION_JSON_VALUE)
public class SimulationNumberGeneratorRest {

    private NumberGeneratorRepository numberGeneratorRepository;

    @Autowired
    public SimulationNumberGeneratorRest(NumberGeneratorRepository numberGeneratorRepository) {
        this.numberGeneratorRepository = numberGeneratorRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public BigDecimal generateSimulationNumber(){
        return numberGeneratorRepository.save(new NumberGenerator()).getId();
    }
}
