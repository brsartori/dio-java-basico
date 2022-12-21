
import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    public void atender(){
        System.out.println("Antendendo telefone");
    };
    public void ligar(){
        System.out.println("Ligando telefone");
    };
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz" );
    };

    public void atualizarPagina(){
        System.out.println("Atualizando Pagina");
    };
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    };

    public void tocar(){
        System.out.println("Tocando musica pelo Iphone");
    };
    public void pausar(){
        System.out.println("Pausando musica pelo Iphone");
    };
    public void selecionarMusica(){
        System.out.println("Selecionando musica pelo Iphone");
    }
    public void exibirPagina(){
        System.out.println("Exibindo pagina de internet");
    }


}