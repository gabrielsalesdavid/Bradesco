package com.methods.bradesco;

public class Aula01 {

    public static void main(String[] args) {

        SmarTv smt = new SmarTv();
        smt.diminuirVolume();
        smt.diminuirVolume();
        smt.diminuirVolume();
        smt.aumentarVolume();

        System.out.println("Canal atual: " + smt.canal);
        smt.mudarCanal(13);
        System.out.println("Canal atual: " + smt.canal);
        System.out.println("Volume atual: " + smt.volume);

        System.out.println("TV ligada? " + smt.ligada);
        System.out.println("Canal atual: " + smt.canal);
        System.out.println("Volume atual: " + smt.volume);

        smt.ligar();
        System.out.println("TV ligada? " + smt.ligada);

        smt.desligar();
        System.out.println("TV ligada? " + smt.ligada);
    }
}