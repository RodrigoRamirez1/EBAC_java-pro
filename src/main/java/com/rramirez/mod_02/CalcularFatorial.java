package com.rramirez.mod_02;

public class CalcularFatorial {

    public static int Fatorial(int num){
        if (num == 0){
            return 1;
        }
        return num * Fatorial(num - 1);
    }
}
