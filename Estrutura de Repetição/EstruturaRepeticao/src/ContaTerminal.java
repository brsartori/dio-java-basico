import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) {
        System.out.println("Bem vindo! Fornceça seus dados asseguir para abertura de sua conta");
        Scanner leitor = new Scanner(System.in);

    String nome;
    int dinheiro;
    String email;

    System.out.println("Digite seu nome: " );
    nome = leitor.next();
    System.out.println("Digite seu email: ");
    email = leitor.next();
    System.out.println("Digite o valor que deseja depositar, só utilize número inteiro");
    dinheiro = leitor.nextInt();

    System.out.println("Muito bem " + nome + " seu email é "+  email +" você depositou " + dinheiro + " reais.");






    }




}