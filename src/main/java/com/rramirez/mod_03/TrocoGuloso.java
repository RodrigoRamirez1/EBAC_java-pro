package com.rramirez.mod_03;

import java.util.ArrayList;
import java.util.List;

public class TrocoGuloso {
    public static void darTroco(int quantia, int[] moedas) {
        List<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < moedas.length; i++) {
            while (quantia >= moedas[i]) {
                quantia -= moedas[i];
                resultado.add(moedas[i]);
            }
        }

        System.out.println("Moedas usadas: " + resultado);
    }

    public static void main(String[] args) {
        int quantia = 18;
        int[] moedas = {5, 2, 1};

        darTroco(quantia, moedas);
    }
}
