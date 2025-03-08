package org.example.domain;

import org.example.domain.interfaces.PaymentStrategy;

import java.util.Scanner;

public class PaymentProcessor {

    private final PaymentStrategy strategy;

    public PaymentProcessor(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iniciando pagamento...");
        System.out.println("Qual o valor do pagamento: ");
        double valor = sc.nextDouble();

        this.strategy.processPayment(valor);

        System.out.println("Processo de pagamento finalizado");
    }

}
