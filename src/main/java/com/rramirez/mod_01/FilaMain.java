package com.rramirez.mod_01;

public class FilaMain {
    public static void main(String[] args) {
        Fila fila = new Fila(10);

        fila.enqueue(3);
        fila.enqueue(7);
        fila.enqueue(1);
        fila.enqueue(9);
        System.out.println(fila);

//        fila.dequeue();
//        System.out.println(fila);

        System.out.println(fila.rear());
        System.out.println(fila.front());
        System.out.println(fila.size());
        System.out.println(fila.isEmpty());


    }
}
