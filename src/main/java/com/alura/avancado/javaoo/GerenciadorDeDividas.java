package com.alura.avancado.javaoo;

/**
 * @autor Adriano Rabello 04/01/2021 - 3:39 PM
 */
public class GerenciadorDeDividas {

    public void efetuarPagamento(Divida divida,String nomePagador, String cnpjPagador, double valor) {

        Pagamento pagamento = new Pagamento(nomePagador, cnpjPagador, valor);
        divida.getPagamentos().registra(pagamento);
    }
}
