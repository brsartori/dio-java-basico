public class ResultadoEscolar {
    public static void main(String[] args) {
       int nota = 5;
       
        if(nota >= 7)
        System.out.println("Aprovado");
        
        else if (nota >= 5 && nota < 7) // Retorno é true ou false
        System.out.println("Em Recuperação");
        
        else
        System.out.println("Reprovado");
    }
}