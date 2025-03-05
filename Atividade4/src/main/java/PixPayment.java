import java.util.Random;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Random random = new Random();
        String pixCode = "PIX-" + random.nextInt(1000000);
        System.out.println("Pagamento via Pix: Codigo gerado: " + pixCode);
        System.out.println("Valor a ser pago: R$ " + amount);
        System.out.println("Pagamento processado com sucesso via Pix!\n");
    }
}
