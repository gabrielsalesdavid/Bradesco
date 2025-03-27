package com.intrducao.bradesco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int idade = scn.nextInt();

        if(idade < 18) {

            System.out.println("Menor de idade");
        } else if(idade > 18 && idade < 64) {

            System.out.println("Maior de Idade");
        } else {

            System.out.println("Idoso");
        }

        sc.close();
    }
}