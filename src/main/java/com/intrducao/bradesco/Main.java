package com.intrducao.bradesco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String primeiroNome = scn.nextLine();
        String segundoNome = scn.nextLine();

        String nome = nomeCompleto(primeiroNome, segundoNome);

        System.out.println();
        System.out.println(nome);

        scn.close();
    }

    public static String nomeCompleto(String primeiroN, String segundoN) {

        return primeiroN.concat(" ").concat(segundoN);
    }
}