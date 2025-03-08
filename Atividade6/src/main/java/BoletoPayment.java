public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento de R$ " + amount + " processado via Boleto.");
    }
}
