package com.alura.avancado.javaoo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * @autor Adriano Rabello 04/01/2021 - 3:30 PM
 */

@NoArgsConstructor

public class Divida {

    private double total;
    private double valorPago;
    private String credor;
    private ArrayList<Pagamento> pagamentos = new ArrayList<>();
    private String cnpjCredor;



    public Divida(String credor, double total, String cnpjCredor){
        this.cnpjCredor = cnpjCredor;
        this.total = total;
        this.credor = credor;
    }


    private void paga(double valor){

        if(valor <= 0 ){
            throw new IllegalArgumentException("Valor ilegal para efetura rpagamento");
        }

        //dando desconto para pagar divida maior que 100
        if(valor > 100){
            valor = valor - 8;
        }

        this.valorPago += valor;
    }

    public void registra(Pagamento pagamento){

        this.getPagamentos().add(pagamento);
        this.paga(pagamento.getValor());
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }



    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValorPago() {
        return valorPago;
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public String getCnpjCredor() {
        return cnpjCredor;
    }

    public void setCnpjCredor(String cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
    }
}
