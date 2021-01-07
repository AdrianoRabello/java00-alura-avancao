package com.alura.avancado.javaoo;

/**
 * @autor Adriano Rabello 04/01/2021 - 3:30 PM
 */

public class Divida {

    private double total;

    private String credor;
    private Documento documentoCredor;
    private Pagamentos pagamentos = new Pagamentos();


    public Divida() {

    }

    public Divida(String credor, Documento documento) {


        this.credor = credor;
        this.setDocumentoCredor(documento);
    }

    /***/
    public void registra(Pagamento pagamento) {
        this.pagamentos.registra(pagamento);
    }


    public void setCredor(String credor) {
        this.credor = credor;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCredor() {
        return this.credor;
    }

    public double getTotal() {
        return this.total;
    }

    public void setDocumentoCredor(Documento documentoCredor) {
        this.documentoCredor = documentoCredor;
    }

    public Documento getDocumentoCredor() {
        return documentoCredor;
    }

    public double getValorPago() {
        return this.pagamentos.getValorPago();
    }
}
