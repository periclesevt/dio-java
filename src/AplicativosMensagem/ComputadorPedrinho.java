package AplicativosMensagem;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        //Escolher
        String appEscolhido = "fb";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fb")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
        smi.salvarHistoricoMensagem();

    }
}