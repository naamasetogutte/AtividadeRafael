public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = "BOLETO-" + (int)(Math.random() * 1000000);
        System.out.println("Pagamento via Boleto: Codigo gerado: " + boletoCode);
        System.out.println("Valor a ser pago: R$ " + amount);
        System.out.println("Pagamento processado com sucesso via Boleto!\n");
    }
}
