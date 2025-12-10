package main.java.solid;

public class PaymentService {

    public void procesPayment(String method, int amount) {
        PaymentProcessor processor = PaymentProcessorFactory.getProcessor(method);

        processor.pay(amount);
    }
}
