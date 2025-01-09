package com.rramirez.mod_02;

public class RecursividadeExercicio1 {

    public static void main(String[] args) {

        int fatorial1 = CalcularFatorial.Fatorial(3);
        System.out.println(fatorial1);

        int fatorial2 = CalcularFatorial.Fatorial(7);
        System.out.println(fatorial2);

        int fatorial3 = CalcularFatorial.Fatorial(102);
        System.out.println(fatorial3);

        //É possível calcular o fatorial de números acima de 100 com recursão usando BigInteger, mas:
        //- É necessário lidar com limitações da pilha.
        //- Para números muito grandes, a abordagem iterativa é mais segura e eficiente.

    }
}
