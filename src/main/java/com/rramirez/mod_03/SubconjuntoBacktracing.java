package com.rramirez.mod_03;

public class SubconjuntoBacktracing {

    public static void gerarSubconjuntos(int[] conjunto, int n) {
        int[] subconjunto = new int[n];
        backtrack(conjunto, subconjunto, 0, 0, n);
    }

    private static void backtrack(int[] conjunto, int[] subconjunto, int index, int start, int n) {

        if (index == n) {
            System.out.print("[");
            for (int i = 0; i < n; i++) {
                System.out.print(subconjunto[i] + (i < n - 1 ? ", " : ""));
            }
            System.out.println("]");
            return;
        }

        for (int i = start; i < conjunto.length; i++) {
            subconjunto[index] = conjunto[i]; // Adiciona elemento ao subconjunto
            backtrack(conjunto, subconjunto, index + 1, i + 1, n); // Chamada recursiva
        }
    }

    public static void main(String[] args) {
        int[] sub1 = {1, 2, 3};
        int n1 = 2;
        gerarSubconjuntos(sub1, n1);

        int[] sub2 = {1, 2, 3, 4};
        int n2 = 1;
        gerarSubconjuntos(sub2, n2);
    }
}
