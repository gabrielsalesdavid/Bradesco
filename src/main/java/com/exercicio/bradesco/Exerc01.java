package com.exercicio.bradesco;

import java.util.Locale;

public class Exerc01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Processo Seletivo");

        double salary = 2200.00;
        analyzingCandidate(salary);
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