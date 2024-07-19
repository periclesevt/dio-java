package AplicativosMensagem;

public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagem pelo Telegram");
    }
}
