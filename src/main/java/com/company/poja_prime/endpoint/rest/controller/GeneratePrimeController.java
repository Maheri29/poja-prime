package com.company.poja_prime.endpoint.rest.controller;

import com.company.poja_prime.service.event.GeneratePrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/new-prime")
public class GeneratePrimeController {

    private final GeneratePrimeService generatePrimeService;

    @Autowired
    public GeneratePrimeController(GeneratePrimeService generatePrimeService) {
        this.generatePrimeService = generatePrimeService;
    }

    @GetMapping
    public String getNewSpecialPrime() {
        BigInteger specialPrime = generatePrimeService.generateSpecialPrime();
        return specialPrime.toString();
    }
}
