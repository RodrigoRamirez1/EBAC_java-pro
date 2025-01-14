package com.rramirez.mod_02;

public class FatorialProgDinamica {
    public static final int MAX_ELEMENTOS =100;
    public static final int[] fatElemento = new int[MAX_ELEMENTOS];


    public static int encontrarElementoPD(int valor){
        for (int i = 0; i < MAX_ELEMENTOS; i++){
            fatElemento[i] = i;
        }
        return encontrarElemento(valor);
    }

    public static int encontrarElemento(int valor){
        if (fatElemento[valor] == 0){
            return 1;
        } else {
            fatElemento[valor] = valor * encontrarElemento(valor -1);
        }
        return fatElemento[valor];
    }

    public static void main(String[] args) {
        int valor = 7;

        System.out.println(valor + " : " + encontrarElementoPD(valor));
    }

    //Não, não conseguimos calcular o fatorial de um número acima de 100 com uma solução recursiva , pois
    // O fatorial de 100 (100!) é um número gigantesco com 158 dígitos! Nenhum dos tipos primitivos de Java
    // (int, long, etc.) consegue armazenar um número tão grande;
    // E também o valor de valor é 101, o que excede o tamanho do array fatElemento (MAX_ELEMENTOS = 100),
    // causando um ArrayIndexOutOfBoundsException

}
