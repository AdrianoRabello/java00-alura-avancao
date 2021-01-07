package com.alura.avancado.javaoo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;

public class Pagamentos {

    private ArrayList<Pagamento> pagamentos = new ArrayList<>();

    private double valorPago;


    public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getData().before(data)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }


    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        paga(pagamento.getValor());
    }


    private void paga(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor invalido para pagamento");
        }
        if (valor > 100) {
            valor = valor - 8;
        }
        this.valorPago += valor;
    }

    public double getValorPago() {
        return this.valorPago;
    }


    public boolean foiRealizado(Pagamento pagamento){

        return this.pagamentos.contains(pagamento);
    }


    /** foi comentando pois a calsse não mais gerda de ArrayList*/

//    @Override
//    public boolean add(Pagamento pagamento) {
//
//        this.paga(pagamento.getValor());
//        return this.pagamentos.add(pagamento);
//    }
//
//
//    @Override
//    public boolean addAll(Collection<? extends Pagamento> c) {
//
//        for (Pagamento pagamento : c){
//            this.paga(pagamento.getValor());
//        }
//        return this.pagamentos.addAll(c);
//    }
}