package org.DesignPatterns.behavioral.strategy_pattern;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment is processing by credit car of amount " + amount);
    }
}
