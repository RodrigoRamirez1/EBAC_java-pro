package com.rramirez.mod_01;

import java.util.Arrays;

public class ListaEncadeada {
    private No[] dados;

    private int posicao;

    public void push(No no){
        dados[posicao] = no;
        if(posicao > 0){
            dados[posicao -1].setProximo(no);
        }
        posicao++;
    }

    public No pop(){
        posicao--;
        No topo = dados[posicao];
        dados[posicao] = null;
        if (posicao > 0){
            dados[posicao -1].setProximo(null);
        }
        return topo;
    }

    public void insert(int index, No no){
        if(dados[index] != null && index < dados.length -1){
            no.setProximo(dados[index]);
            No[] novoDados = new No[dados.length +1];
            for (int i = 0; i < dados.length; i++){
               if(i >= index){
                   novoDados[i +1] = dados[i];
               }else{
                   novoDados[i] = dados[i];
               }
            }
            dados = novoDados;
        }
        dados[index] = no;
        if(index > 0){
            dados[index -1].setProximo(no);
        }
        posicao++;
    }

    public void remove(int index){
        No no = dados[index];
        if(no != null && index > 0){
            dados[index -1].setProximo(no.getProximo());
        }
        No[] novoDados = new No[dados.length];

        for (int i = 0; i < dados.length; i++){
            if(i > index){
                novoDados[i -1] = dados[i];
            }else if (i<index){
                novoDados[i] = dados[i];
            }
        }
        dados = novoDados;
        posicao--;
    }

    public int size(){
        return posicao;
    }

    public void printList(){
        System.out.println(this);
    }

    public No elementAt(int index){
        return dados[index];
    }

    public ListaEncadeada(int tamanho){
        this.dados = new No[tamanho];
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "dados=" + Arrays.toString(dados) +
                '}';
    }
}
