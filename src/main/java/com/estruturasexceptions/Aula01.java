package com.estruturasexceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aula01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        try {

            System.out.println("Digite seu nome:");
            String name = scn.next();
            System.out.println("Digite seu sobrenome:");
            String surname = scn.next();
            System.out.println("Digite sua idade:");
            int age = scn.nextInt();
            System.out.println("Digite sua altura:");
            double height = scn.nextDouble();
            System.out.println();

            System.out.println();
            System.out.printf("Olá, me chamo %s %s \n", name, surname);
            System.out.printf("Tenho %d anos \n", age);
            System.out.printf("Minha altura é %.2f cm \n", height);

        } catch(InputMismatchException e) {

                System.err.println("O campos idade e altura precisam ser numéricos!");
        }
    }
}