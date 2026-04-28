package org.DesignPatterns.behavioral.strategy_pattern;

public class ClientPayment {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.setStrategy(new CreditCardPayment());
        paymentProcessor.makePayment(1000);

        paymentProcessor.setStrategy(new UpiPayment());
        paymentProcessor.makePayment(4000);
    }
}
