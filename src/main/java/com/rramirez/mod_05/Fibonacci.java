package com.rramirez.mod_05;

public class Fibonacci {

    public int findElemento(int valor){
        if(valor <= 1){
            return valor;
        }
        return findElemento(valor - 1) + findElemento(valor - 2);
    }

//    public static void main(String[] args) {
//        int n = 6;
//
//        System.out.println(findElemento(n));
//    }
}
