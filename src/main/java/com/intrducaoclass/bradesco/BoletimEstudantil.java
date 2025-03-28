package com.intrducaoclass.bradesco;

import java.util.Scanner;

public class BoletimEstudantil {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int mediaFinal = scn.nextInt();

        if(mediaFinal < 6) {

            System.out.println("REPROVADO");
        } else if(mediaFinal == 6) {

            System.out.println("PROVA MINERVA");
        } else {

            System.out.println("APROVADO");
        }

        scn.close();
    }
}