package lld.strategyDesignPattern;

public class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        strategy.pay(amount);
    }
    
    public static void main(String[] args) {
    	PaymentContext payment =
    	        new PaymentContext(new UpiPayment());
    	payment.executePayment(500);

	}
}
