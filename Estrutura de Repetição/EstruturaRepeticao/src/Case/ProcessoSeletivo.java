package Case;

import java.util.concurrent.ThreadLocalRandom;

import javax.print.attribute.TextSyntax;
import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;

import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe","Marcia","João","Peterson","Jonas"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else 
                System.out.println("Contato Realizado com Sucesso");    

        }while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("Conseguimos contatos com "+ candidato + " na "+ tentativasRealizadas + " tentativas");
        else
            System.out.println("Não conseguimos contatos com" + candidato + ", número máximo de tentativas " + tentativasRealizadas);


    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }


    static void imprimirSelecionados (){
        String [] candidatos = {"Felipe","Marcia","João","Peterson","Jonas"};
        System.out.println("Imprimindo lista de candidatos informando  o indice do elemento");

        for (int indice = 0; indice<candidatos.length; indice ++){
            System.out.println("O candidato de nº" + (indice+1) + " é " + candidatos[indice] );
        }
        System.out.println("Imprimindo lista de candidatos abreviada");
        for (String candidato:candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
        
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe","Marcia","João","Peterson","Jonas","Jamile","Pedro","Magaiver","Pamela"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual ++;
        }
        
    
    }
    static double valorPretendido () {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato");
        }
        else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contraproposta");
        }
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
        }


    }
