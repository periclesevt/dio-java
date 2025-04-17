package ModelagemIphone;

public class Iphone {

    private final ReprodutorMusicalImpl reprodutor;

    private final AparelhoTelefonicoImpl telefone;

    private final NavegadorInternetImpl navegador;

    public Iphone() {
        System.out.println("Construtor do iPhone foi chamado!"); // Debug
        this.reprodutor = new ReprodutorMusicalImpl();
        this.telefone = new AparelhoTelefonicoImpl();
        this.navegador = new NavegadorInternetImpl();
    }

    public void usarReprodutor() {
        String musica = "Brand New - Last Chance To Lose Your Keys";
        reprodutor.selecionarMusica(musica);
        reprodutor.tocar();
        reprodutor.pausar();
    }

    public void usarTelefone(){
        String numero = "88360853";
        telefone.ligar(numero);
        telefone.atender();
        telefone.iniciarCorreioVoz();
    }

    public void usarNavegador(){
        String url = "www.github.com/periclesevt";
        navegador.adicionarNovaAba();
        navegador.exibirPagina(url);
        navegador.atualizarPagina();
    }


    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.usarReprodutor();
        iphone.usarTelefone();
        iphone.usarNavegador();

    }
}
