package com.alura.avancado.javaoo.pagamento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @autor Adriano Rabello 06/01/2021 - 9:31 PM
 */
public class TestePagamento {

    public static void main(String[] args) {

        PagadorDeFuncionario pagadorDeFuncionario = new PagadorDeFuncionario();

        Assalariado chefe = new Chefe();
        Assalariado funcionario = new Funcionario();
        Assalariado estagiario = new Estagiario();

        List<Assalariado> assalariados = new ArrayList<>();
        assalariados.addAll(Arrays.asList(chefe,funcionario,estagiario));

        for (Assalariado assalariaro: assalariados) {

            pagadorDeFuncionario.pagarAssalariado(assalariaro);
            assalariaro.informarSalario();
        }

    }
}
