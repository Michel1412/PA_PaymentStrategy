package org.example.domain;

import org.example.domain.interfaces.PaymentStrategy;

import java.util.Scanner;

public class PaymentProcessor {

    public static void execute(PaymentStrategy strategy) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iniciando pagamento...");
        System.out.println("Qual o valor do pagamento: ");
        double valor = sc.nextDouble();

        strategy.processPayment(valor);

        System.out.println("Processo de pagamento finalizado");
    }

}
