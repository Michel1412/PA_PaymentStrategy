package org.example.domain.services;

import org.example.domain.interfaces.PaymentStrategy;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do cartão de credito: ");
        String numCard = sc.nextLine();

        System.out.println("Será creditado " + amount + " do cartao " + numCard);
    }
}
