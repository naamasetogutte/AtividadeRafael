import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");


        String paymentOption = scanner.nextLine();


        System.out.println("Digite o valor da transação:");
        double amount = scanner.nextDouble();


        PaymentStrategy paymentStrategy = PaymentFactory.createPayment(paymentOption);


        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.executePayment(amount);

        scanner.close();
    }
}
