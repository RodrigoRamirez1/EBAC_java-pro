package com.rramirez.mod_01;

import java.util.Arrays;

public class Fila {
    private int[] dados;
    private int posicao;

    public void enqueue(int valor){
        dados[posicao] = valor;
        posicao++;
    }

    public void dequeue(){
        int[] novosDados = new int[dados.length];
        for (int i = 0; i < dados.length -1; i++){
            novosDados[i] = dados[i + 1];
        }
        dados = novosDados;
    }

    public int rear(){
        return dados[posicao -1];
    }

    public int front(){
        return dados[0];
    }

    public int size(){
        return posicao;
    }

    public Boolean isEmpty(){
        return posicao == 0;
    }

    public Fila(int tamanho){
        this.dados = new int[tamanho];
    }

    @Override
    public String toString() {
        return "Fila{" +
                "dados=" + Arrays.toString(dados) +
                '}';
    }
}
