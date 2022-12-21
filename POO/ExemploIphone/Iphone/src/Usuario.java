import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        AparelhoTelefonico telefone = iphone;
        NavegadorInternet navegador = iphone;
        ReprodutorMusical musical = iphone;

        telefone.ligar ();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        navegador.exibirPagina();

        musical.tocar();
        musical.pausar();
        musical.selecionarMusica();
        

    }
}
