public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento de R$ " + amount + " processado via Pix.");
    }
}
