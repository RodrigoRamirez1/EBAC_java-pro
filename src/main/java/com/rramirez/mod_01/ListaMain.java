package com.rramirez.mod_01;

public class ListaMain {
    public static void main(String[] args) {
        ListaEncadeada lista= new ListaEncadeada(10);

        lista.push(new No(3));
        lista.push(new No(7));
        lista.push(new No(1));
        System.out.println(lista);

        System.out.println(lista.elementAt(0).getProximo());

        System.out.println(lista.pop());
        System.out.println(lista);

        lista.insert(1,new No(9));
        System.out.println(lista);

        lista.remove(2);
        System.out.println(lista);

        System.out.println(lista.size());

        lista.printList();
    }
}
