package org.example.domain.services;

import org.example.domain.interfaces.PaymentStrategy;

import java.util.UUID;

public class PixPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("QrCode Pix: " + UUID.randomUUID().toString());
    }

}
