package com.estruturarepeticao.bradesco;

public class ParaColecao {

    public static void main(String[] args) throws InterruptedException {

        String[] alunos = {"Felipe", "Jonas", "Julia", "Marcos"};

        for(String alu : alunos) {

            System.out.println("O aluno no indice x = é " + alu);

            Thread.sleep(1250);
        }
    }
}