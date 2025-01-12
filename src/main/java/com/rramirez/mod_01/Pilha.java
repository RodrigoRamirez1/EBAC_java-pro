package com.rramirez.mod_01;

import java.util.Arrays;

public class Pilha {
    private int[] dados;

    private int posicao;

    public void push(int valor){
        dados[posicao] = valor;
        posicao++;
    }

    public int pop(){
        posicao--;
        int topo = dados[posicao];
        dados[posicao] = 0;

        return topo;
    }

    public int top(){
        return dados[posicao-1];
    }

    public Boolean isEmpty(){
        return posicao == 0;
    }

    public int size(){
        return posicao;
    }

    public Pilha(int tamanho){
        this.dados = new int[tamanho];
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "dados=" + Arrays.toString(dados) +
                '}';
    }
}
