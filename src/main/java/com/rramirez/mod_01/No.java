package com.rramirez.mod_01;

public class No {
    private int valor;
    private No proximo;

    public No(int valor) {
        this.valor = valor;

    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public int getValor() {
        return valor;
    }

    public No getProximo() {
        return proximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "valor=" + valor +
                ", proximo=" + proximo +
                '}';
    }
}
