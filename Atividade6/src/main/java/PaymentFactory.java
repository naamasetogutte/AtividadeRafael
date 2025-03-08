public class PaymentFactory {

    public static PaymentStrategy createPayment(String paymentType) {
        switch (paymentType) {
            case "1":
                return new PixPayment();
            case "2":
                return new CreditCardPayment();
            case "3":
                return new BoletoPayment();
            default:
                throw new IllegalArgumentException("Método de pagamento desconhecido");
        }
    }
}
