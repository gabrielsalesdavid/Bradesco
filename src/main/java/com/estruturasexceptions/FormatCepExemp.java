package com.estruturasexceptions;

public class FormatCepExemp {

    public static void main(String[] args) {

        try {

            String CepFormaded = formatCep("23765064");
            System.out.println(CepFormaded);
        } catch(CepInvalidException e) {

            e.printStackTrace();
        }
    }

    public static String formatCep(String cep) throws CepInvalidException {

        if(cep.length() != 8) {

            throw new CepInvalidException();
        }

        return "23.765-064";
    }
}