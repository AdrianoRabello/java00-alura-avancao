package com.alura.avancado.javaoo.pagamento;

/**
 * @autor Adriano Rabello 06/01/2021 - 9:22 PM
 */
public class Chefe implements Assalariado {

    private double salario;


    @Override
    public void paga(double valor) {

        this.salario = valor;
    }

    @Override
    public double getSalarioBase() {
        return 1000;
    }

    @Override
    public double getExtras() {
        return 1000;
    }

    @Override
    public void informarSalario() {

        System.out.println("valor do salario do chefe " + this.salario);
    }


}
