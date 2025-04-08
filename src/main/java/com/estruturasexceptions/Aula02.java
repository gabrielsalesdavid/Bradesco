package com.estruturasexceptions;

import java.text.NumberFormat;
import java.text.ParseException;

public class Aula02 {

    public static void main(String[] args) throws ParseException {

        Number value = Double.valueOf("a1.75");
        value = NumberFormat.getInstance().parse("a1.75");

        System.out.println(value);
    }
}