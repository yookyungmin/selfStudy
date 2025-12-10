package main.java.solid;

public class PaymentProcessorFactory {

    public static PaymentProcessor getProcessor(String method) {
        switch (method) {
            case "CARD":
                return new CardPaymentProcessor();
            case "BANK":
                return new BankPaymentProcessor();
            case "KAKAOPAY":
                return new KakaoPayProcessor();
            default:
                throw new IllegalArgumentException("지원하지 않는 결제수단입니다: " + method);
        }
    }
}
