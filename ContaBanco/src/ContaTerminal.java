import java.util.Scanner;

public class ContaTerminal {

    static int numeroConta;
    static String numeroAgencia;
    static String nomeCliente;
    static float saldoConta;

    public static void CriarConta(){
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta! :");
        numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência! :");
        numeroAgencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente! :");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta! :");
        saldoConta = scanner.nextFloat();

        scanner.close();

    }

    public static void MensagemSistema(){
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta +
                " e seu saldo " + saldoConta + " já está disponível para saque. ");
    }


    public static void main(String[] args) {
        CriarConta();
        MensagemSistema();
    }
}
