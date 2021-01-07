package com.alura.avancado.javaoo.pagamento;

/**
 * @autor Adriano Rabello 06/01/2021 - 9:22 PM
 */
public class PagadorDeFuncionario {

    public void pagarAssalariado(Assalariado assalariado) {
      assalariado.paga(assalariado.getSalarioBase() + assalariado.getExtras());
    }

}