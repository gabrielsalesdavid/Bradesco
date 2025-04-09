package com.exercicio.bradesco;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Exerc02 {

    public static void main(String[] args) {

        String[] candidate = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String list : candidate) {

            gettingIntouch(list);
        }
    }

    static void gettingIntouch(String candidate) {

        int attemptMade = 1;
        boolean keepTrying = true;
        boolean answered = false;

        do {

            answered = toMeet();
            keepTrying = !toMeet();

            if(keepTrying) {

                attemptMade++;
            } else {

                System.out.println("Contato realziado com sucesso!");
            }

        } while(keepTrying && attemptMade < 3);

        if(answered) {

            System.out.println("Conseguimos contato com " + candidate + " na " + attemptMade + " tentativa");
        } else {

            System.out.println("Não conseguimos contato com " + candidate + " numeros maximo tentativas " + attemptMade + " realizada");
        }
    }

    static boolean toMeet() {

        return new Random().nextInt(3) == 1;
    }

    static void printSelected() {

        String[] candidate = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int i = 0; i < candidate.length; i++) {

            System.out.println("O candidato de nº " + (i + 1) + " é " + candidate[i]);
        }
    }

    static void candidateSelection() {

        String[] candidate = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Daniela", "Joana"};

        int candidateSelect = 0;
        int candidateActual = 0;
        double salaryB = 2000.00;
        while(candidateSelect < 5 && candidateActual < candidate.length) {

            String candid = candidate[candidateActual];
            double desired = desiredValue();

            System.out.println("O candidato " + candidate + " Solicitou este valor de salário " + desired);
            if(salaryB >= desired) {

              System.out.println("O candidato " + candidate + " foi selecionado para a vaga");
              candidateSelect++;
            }

            candidateActual++;
        }
    }

    static double desiredValue() {

        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analyzingCandidate(double desiredSalary) {

        double salaryBase = 2200.00;
        if(salaryBase > desiredSalary) {

            System.out.println("Ligar para o candidato!");
        } else if(salaryBase >= desiredSalary) {

            System.out.println("Ligar para o candidato com contra proposta!");
        } else {

            System.out.println("Aguardando o resultado dos demais candidatos!");
        }
    }
}