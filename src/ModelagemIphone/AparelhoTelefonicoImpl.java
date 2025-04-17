package ModelagemIphone;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico{
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando reproducao correio de voz...");
    }
}
