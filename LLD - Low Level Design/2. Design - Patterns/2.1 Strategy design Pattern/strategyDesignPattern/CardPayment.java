package lld.strategyDesignPattern;

public class CardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid via Card: " + amount);
    }
}

