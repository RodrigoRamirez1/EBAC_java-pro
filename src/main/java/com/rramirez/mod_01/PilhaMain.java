package com.rramirez.mod_01;

public class PilhaMain {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);

        pilha.push(3);
        pilha.push(7);
        pilha.push(1);
        System.out.println(pilha);

        pilha.pop();
        System.out.println(pilha);

        System.out.println(pilha.top());
        System.out.println(pilha.isEmpty());
        System.out.println(pilha.size());
    }
}
