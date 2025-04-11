package ContaBancaria;

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(300);

        exibirDadosConta(conta);


    }

    private static void exibirDadosConta(ContaBancaria conta){
        System.out.println("Saldo: R$" + conta.consultarSaldo());
        System.out.println("Limite Cheque Especial: R$" + conta.consultarChequeEspecial());
        System.out.println("Usando Cheque Especial? " + (conta.estaUsandoChequeEspecial() ? "Sim" : "Nao"));
    }


    private static void realizarSaque(ContaBancaria conta, double valor){
        try{
            conta.sacar(valor);
                    System.out.println("Saque de R$" + valor + "realizado");
        } catch (IllegalArgumentException e){
            System.out.println("Erro no saque: " + e.getMessage());
        }
    }

    private static void realizarDeposito(ContaBancaria conta, double valor){
        try{
            conta.depositar(valor);
                    System.out.println("Deposito de R$" + valor + "realizado");
        } catch (IllegalArgumentException e){
            System.out.println("Erro no deposito: " + e.getMessage());
        }
    }

    private static void pagarBoleto(ContaBancaria conta, double valor){
        try{
            conta.pagarBoleto(valor);
            System.out.println("Boleto de R$" + valor + "pago");
        } catch (IllegalArgumentException e){
            System.out.println("Erro no pagamento: " + e.getMessage());
        }
    }
}


