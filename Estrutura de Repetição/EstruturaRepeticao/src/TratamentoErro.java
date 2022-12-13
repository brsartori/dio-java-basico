import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
/*Aparentemente é um programa simples, mas vamos listar 
*algumas possíveis exceções que podem acontencer.
*Não informar o nome e sobrenome
*O valor da idade ter um caractere NÃO numérico
*O valor da altura ter uma vírgula ao invês de 
*ser um ponto (conforme padrão americano) 
 */
public class TratamentoErro {
    public static void main(String[] args) {
        try{
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
        }
        catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos. Ex: 33 ; 1.75");
        }   
    }


}
/*Erros que existem
* java.lang.NullPointerException	
* Quando tentamos obter alguma informação de uma variável nula.
*java.lang.ArithmeticException	
*Quando tentamos dividir um valor por zero.
*java.sql.SQLException	
*Quando existe algum erro relacionado a interação com banco de dados.
*java.io.FileNotFoundException	
*Quando tentamos ler ou escrever em um arquivo que não existe.
*/
