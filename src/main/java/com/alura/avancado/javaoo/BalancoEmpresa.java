package com.alura.avancado.javaoo;

import java.util.HashMap;

/**
 * @autor Adriano Rabello 04/01/2021 - 3:31 PM
 */
public class BalancoEmpresa {

    private HashMap<String, Divida> dividas = new HashMap<>();

    public void registraDivida(String credor, String cnpjCredor, double valor){

        Divida divida = new Divida(credor, valor,cnpjCredor);
        dividas.put(cnpjCredor,divida);
    }

    public void pagaDivida(String cnpjCredor, double valor, String nomePagador,String cnpjPagador){

        Divida divida = dividas.get(cnpjCredor);

        if(divida != null){


            Pagamento pagamento = new Pagamento(nomePagador,cnpjPagador, valor);
            divida.registra(pagamento);

        }


    }
}
