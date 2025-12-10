package main.java.solid;

/*
원칙	설명
SRP	Processor는 ‘해당 결제 방식 로직’만 책임
OCP	KakaoPayProcessor 추가해도 Service·Controller 수정 없음
LSP	모든 Processor는 동일하게 호출 가능
ISP	최소 기능(pay)만 가진 인터페이스
DIP	Controller → Service → Interface → 구현체 구조
 */
public class PaymentController {

    private final PaymentService paymentService = new PaymentService();

    public void pay(String payMethod, int amount) {
        // payMethod 예시: "CARD", "BANK", "KAKAOPAY"
        paymentService.procesPayment(payMethod, amount);
    }

    public static void main(String[] args) {
        PaymentController controller = new PaymentController();

        controller.pay("CARD", 50000);
        controller.pay("BANK", 120000);
        controller.pay("KAKAOPAY", 30000);
    }
}
