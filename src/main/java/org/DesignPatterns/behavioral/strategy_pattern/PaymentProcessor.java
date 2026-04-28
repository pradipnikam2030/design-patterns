package org.DesignPatterns.behavioral.strategy_pattern;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;

    public void setStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(int amount){
        paymentStrategy.pay(amount);
    }
}
