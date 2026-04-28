package org.DesignPatterns.behavioral.strategy_pattern;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment is processing by UpiPayment of amount " + amount);
    }
}
