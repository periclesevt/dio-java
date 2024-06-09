package ProcessoSeletivo;

import java.util.Random;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        //analisarCandidato(); //Um dos cases solicitados, mas desnecessário diante da seleção feita em selecionarCandidatos();
        ligarCandidato(imprimirSelecionados(selecionarCandidatos()));

    }

    static void ligarCandidato(ArrayList candidatos){
        int tentativasRealizadas = 0;

        for (Object candidato : candidatos){
            while (tentativasRealizadas < 3){
                if (atender()){
                    System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " APÓS " + (tentativasRealizadas+1) + " TENTATIVAS ");
                    break;
                } else {
                    System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato);
                }
                tentativasRealizadas++;
            }
            tentativasRealizadas = 0;
        }
    }

    static ArrayList imprimirSelecionados(ArrayList candidatos){
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        int ordem = 1;

        for (Object candidato : candidatos) {
            System.out.println("O candidato de n° " + ordem + " é " + candidato);
            ordem++;
        }
        return candidatos;
    }

    static void analisarCandidato(){

        double salarioBase = 2000;

        valorPretendido();
        if (salarioBase > valorPretendido()) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == valorPretendido()) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADOS DOS DEMAIS CANDIDATOS");
        }

    }

    //não é mais chamado sozinho, apenas por imprimirCandidatos
    static ArrayList selecionarCandidatos(){

        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        ArrayList listaCandidatosSelecionados = new ArrayList();

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados ++;
                listaCandidatosSelecionados.add(candidatos[candidatosAtual]);
            }
            else{
                System.out.println("O candidato " + candidato + " NÃO foi selecionado para a vaga");
            }
            candidatosAtual++;
        }
        return listaCandidatosSelecionados;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
}