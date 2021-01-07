package com.alura.avancado.javaoo;

public class Cnpj implements Documento{

    private String valor;

    public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorretoParaCnpj()
                && segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
    }
    private int primeiroDigitoCorretoParaCnpj() {
        // Extrai o primeiro dígito verificador do CNPJ armazenado
        // no atributo cnpj

        return 1;
    }
    private int primeiroDigitoVerificador() {
        // Extrai o segundo dígito verificador do CNPJ armazenado
        // no atributo cnpj
        return 1;
    }

    private int segundoDigitoCorretoParaCnpj() {
        // Calcula o primeiro dígito verificador correto para
        // o CNPJ armazenado no atributo cnpj
        return 1;
    }
    private int segundoDigitoVerificadorDoCnpj() {
        // Calcula o primeiro dígito verificador correto para
        // o CNPJ armazenado no atributo cnpj
        return 1;
    }
    public void setValor(String cnpjCredor) {
        this.valor = cnpjCredor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String
    toString() {
        return this.valor;
    }
}
