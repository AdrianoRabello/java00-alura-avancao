package com.alura.avancado.javaoo;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @autor Adriano Rabello 04/01/2021 - 7:05 PM
 */
public class RelatorioDivida {

    private final Divida divida;
    public RelatorioDivida(Divida divida){

        this.divida = divida;
    }

    public void geraRelatorio(){

        System.out.println("cnpj credor " + this.divida.getCnpj().getValor());
        System.out.println("Credor " + this.divida.getCredor());

        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("pt", "BR"));


        System.out.println("valor total " + numberFormat.format(divida.getTotal()));
    }
}
