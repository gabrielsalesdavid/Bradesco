package com.estruturacondicional.bradesco;

public class SwitchCase {

    public static void main(String[] args) {

        String plano = "B";

        switch(plano) {
            case "B" -> System.out.println("100 minutos de ligação");
            case "M" ->{
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e Instagram gratis!");
            }
            case "T" ->{
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e Instagram gratis!");
                System.out.println("5Gb YouTube!");
            }
            default -> System.out.println("Opção invalida!");
        }
    }
}