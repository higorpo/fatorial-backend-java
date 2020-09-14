package com.fatorial.api.controllers;

import java.math.BigInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class FactorialController {
    @GetMapping(value = "/factorial", produces = MediaType.APPLICATION_JSON_VALUE)
    String compute(@RequestParam Integer number) {
        return "{\"result\": \""+ factorial(number).toString() +"\"}";
    }

    public static BigInteger factorial(int number) { 
        BigInteger factorial = BigInteger.ONE; 

        for (int i = number; i > 0; i--) { 
            factorial = factorial.multiply(BigInteger.valueOf(i)); 
        } 

        return factorial; 
    }
}