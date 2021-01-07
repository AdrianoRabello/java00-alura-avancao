package com.alura.avancado.javaoo;

import java.util.HashMap;

/**
 * @autor Adriano Rabello 04/01/2021 - 3:31 PM
 */
public class BalancoEmpresa {

    private HashMap<Documento, Divida> dividas = new HashMap<>();

    public void registraDivida(Divida divida) {
        if (divida.getDocumentoCredor() != null) {
            dividas.put(divida.getDocumentoCredor(), divida);
        }
    }

    public void pagaDivida(Documento documentoCredor, Pagamento pagamento){

        Divida divida = dividas.get(documentoCredor);

        if(divida != null){

            /** eu consigo fazer isso pois getPagamentos é uma classe e não um array */
            divida.registra(pagamento);

        }


    }
}
