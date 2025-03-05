import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o metodo de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartao de Credito");
        System.out.println("3: Boleto");
        System.out.print("Digite a opcao (1, 2 ou 3): ");
        int choice = scanner.nextInt();

        System.out.print("Digite o valor da transacao: R$ ");
        double amount = scanner.nextDouble();

        PaymentStrategy paymentStrategy = null;
        switch (choice) {
            case 1:
                paymentStrategy = new PixPayment();
                break;
            case 2:
                paymentStrategy = new CreditCardPayment();
                break;
            case 3:
                paymentStrategy = new BoletoPayment();
                break;
            default:
                System.out.println("Opcao invalida! Finalizando.");
                return;
        }

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.executePayment(amount);

        scanner.close();
    }
}
