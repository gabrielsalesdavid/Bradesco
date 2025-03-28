package com.tipovariavel.bradesco;

public class VarType {

    public static void main(String[] args) {

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto01 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }
}