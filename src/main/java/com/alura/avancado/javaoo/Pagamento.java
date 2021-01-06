package com.alura.avancado.javaoo;

import lombok.Getter;

import java.util.Calendar;

/**
 * @autor Adriano Rabello 04/01/2021 - 3:46 PM
 */


public class Pagamento {

    private String pagador;
    private String cnpjPagador;
    private double valor;

    private Calendar data;


    public Pagamento(){

    }

    public Pagamento(String pagador, String cnpjPagador, double valor){

        this.pagador = pagador;
        this.cnpjPagador = cnpjPagador;
        this.valor = valor;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public String getCnpjPagador() {
        return cnpjPagador;
    }

    public void setCnpjPagador(String cnpjPagador) {
        this.cnpjPagador = cnpjPagador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Calendar getData() {
        return data;
    }
}
