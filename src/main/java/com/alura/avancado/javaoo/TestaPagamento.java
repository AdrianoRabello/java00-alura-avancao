package com.alura.avancado.javaoo;

public class TestaPagamento {


    public static void main(String[] args) {

        Pagamentos pagamentos = new Pagamentos();
        Pagamento pagamento1 = new Pagamento();
        Pagamento pagamento2 = new Pagamento();

        pagamento1.setValor(105);
        pagamento2.setValor(25);

        pagamentos.add(pagamento1);
        pagamentos.add(pagamento2);


        System.out.println(pagamentos.getValorPago());


    }
}
