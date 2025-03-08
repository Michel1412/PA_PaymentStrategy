package org.example.domain.services;

import org.example.domain.interfaces.PaymentStrategy;

import java.util.UUID;

public class BoletoPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Codigo do boleto: " + UUID.randomUUID());
    }
}
