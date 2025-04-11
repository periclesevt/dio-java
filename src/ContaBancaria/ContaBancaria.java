package ContaBancaria;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecialLimite;
    private double chequeEspecialOriginal;

    public ContaBancaria(double depositoInicial){
        if (depositoInicial < 0){
            throw new IllegalArgumentException("Depósito inicial não pode ser negativo");
        }

        this.saldo = depositoInicial;

        if (depositoInicial <= 500){
            this.chequeEspecialLimite = 50;
        } else {
            this.chequeEspecialLimite = depositoInicial * 0.5;
        }
        this.chequeEspecialOriginal =  this.chequeEspecialLimite;
    }

    public double consultarSaldo(){
        return saldo;
    }

    public double consultarChequeEspecial(){
        return chequeEspecialLimite;
    }

    public boolean estaUsandoChequeEspecial(){
        return saldo < 0;
    }

    public void depositar (double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor do depósito deve ser positivo");
        }

        if (saldo < 0){
            double valorChequeUsado = Math.min(-saldo, chequeEspecialOriginal);
            double taxa = valorChequeUsado * 0.2;

            double valorTotalNecessario = valorChequeUsado * taxa;

            if (valor >= valorTotalNecessario){
                saldo = valor - valorTotalNecessario;
            } else {
                double dividaRestante = valorTotalNecessario - valor;
                saldo = -dividaRestante;
            }
        }
    }
}
