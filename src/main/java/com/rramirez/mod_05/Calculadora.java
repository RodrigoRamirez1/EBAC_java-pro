package com.rramirez.mod_05;

/**
 * A classe calculadora tem os métodos da mátematica básica.
 */
public class Calculadora {

    /**
     * o Método faz a soma de dois inteiros
     * @param a um número inteiro que irá ser somado com o b;
     * @return a soma de a + b;
     */
    public int adicionar(int a, int b){
        return a + b;
    }

    /**
     * o método faz a subtração de dois inteiros;
     * @param a um número inteiro que irá ser subtraido por b;
     * @return a subtração de a com b;
     */
    public int subtrair(int a, int b){
        return a - b;
    }

    /**
     * o método faz a multiplicação de dois inteiros;
     * @param a um número inteiro que irá ser multiplicado por b;
     * @return a multiplicação de a com b;
     */
    public int multiplicar(int a, int b){
        return a * b;
    }

    /**
     * o método faz a divisão de dois inteiros;
     * @param a um número inteiro que irá ser dividido por b;
     * @return a divisão de a com b;
     */
    public int dividir (int a, int b){
        if(b == 0){
            System.out.println("Error: divisão por zero.");
            return 0;
        }
        return a / b;
    }

    //A classe com seu métodos não necessitaria de ser documentada,
    // pois são métodos muito simples e  autoexplicativo;
}
