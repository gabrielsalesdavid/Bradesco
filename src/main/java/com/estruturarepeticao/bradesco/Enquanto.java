package com.estruturarepeticao.bradesco;

import java.util.concurrent.ThreadLocalRandom;

public class Enquanto {

    public static void main(String[] args) {

        double mesada = 50.0;

        while(mesada > 0) {

            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada) {

                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + " Adcionado no carrinho");
            mesada -= valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doce");
    }

    private static double valorAleatorio() {

        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}