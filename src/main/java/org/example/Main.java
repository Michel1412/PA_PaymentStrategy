package org.example;

import org.example.domain.PaymentProcessor;
import org.example.domain.services.BoletoPayment;
import org.example.domain.services.CreditCardPayment;
import org.example.domain.services.PixPayment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa de teste de StrategyPattern...");
        System.out.println();

        int opt;

        do {
            System.out.println("Qual opcao de pagamento vc deseja utilizar:\n1 - Pix\n2 - Cartao de Credito\n3 - Boleto\n0 - Sair");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    PaymentProcessor.execute(new PixPayment());
                    break;

                case 2:
                    PaymentProcessor.execute(new CreditCardPayment());
                    break;

                case 3:
                    PaymentProcessor.execute(new BoletoPayment());
                    break;

                default:
                    if (opt != 0)
                        System.out.println("Opcao invalida saindo do programa...");

                    opt = 0;
            }
        } while (opt != 0);

    }
}