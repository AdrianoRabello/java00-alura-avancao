package com.alura.avancado.javaoo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * @autor Adriano Rabello 04/01/2021 - 3:30 PM
 */

public class Divida {

    private double total;

    private String credor;
    private Cnpj cnpj = new Cnpj();
    private Pagamentos pagamentos = new Pagamentos();


    public Divida() {

    }

    public Divida(String credor, double valorPago, String cnpjCredor) {

        this.credor = credor;
        getCnpj().setValor(cnpjCredor);
    }


    public void setCredor(String credor) {
        this.credor = credor;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCredor() {
        return this.credor;
    }

    public double getTotal() {
        return this.total;
    }

    public Cnpj getCnpj() {
        return cnpj;
    }

    public Pagamentos getPagamentos() {
        return pagamentos;
    }
}
