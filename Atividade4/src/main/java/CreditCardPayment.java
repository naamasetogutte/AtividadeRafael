import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero do cartao de credito (ficticio): ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento via cartao de credito: Numero do cartao " + cardNumber);
        System.out.println("Valor a ser pago: R$ " + amount);
        System.out.println("Pagamento processado com sucesso via Cartao de Credito!\n");
    }
}
