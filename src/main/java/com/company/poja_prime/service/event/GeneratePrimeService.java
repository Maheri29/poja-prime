package com.company.poja_prime.service.event;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class GeneratePrimeService {

    public BigInteger generateSpecialPrime() {

        return BigInteger.probablePrime(1000, new java.util.Random());
    }
}
