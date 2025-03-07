import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de notificacao:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Notificacao Push");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        String tipo = "";
        switch (escolha) {
            case 1:
                tipo = "email";
                break;
            case 2:
                tipo = "sms";
                break;
            case 3:
                tipo = "push";
                break;
            default:
                System.out.println("Opcao invalida!");
                return;
        }

        System.out.println("Digite a mensagem a ser enviada:");
        String mensagem = scanner.nextLine();

        try {
            Notificacao notificacao = FabricaNotificacao.criarNotificacao(tipo);
            notificacao.enviar(mensagem);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar a notificacao: " + e.getMessage());
        }
    }
}
