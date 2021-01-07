package com.alura.avancado.javaoo.pagamento;

/**
 * @autor Adriano Rabello 06/01/2021 - 9:24 PM
 */
public interface Assalariado {

    void paga(double valor);
    double getSalarioBase();
    double getExtras();

    void informarSalario();

}
