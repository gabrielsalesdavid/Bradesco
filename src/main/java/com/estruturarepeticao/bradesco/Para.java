package com.estruturarepeticao.bradesco;

public class Para {

    public static void main(String[] args) throws InterruptedException {

        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println(carneirinhos);
            Thread.sleep(1250);//Faz com que a contagem seja devagar conforme declarado em millis!
        }
    }
}