package lld.strategyDesignPattern;

public class UpiPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

