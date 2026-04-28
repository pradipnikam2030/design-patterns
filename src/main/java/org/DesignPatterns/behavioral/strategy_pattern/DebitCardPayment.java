package org.DesignPatterns.behavioral.strategy_pattern;

public class DebitCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment is processing by Debit Card of amount " + amount);
    }
}
