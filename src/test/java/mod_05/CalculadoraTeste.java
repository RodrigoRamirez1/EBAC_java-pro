package mod_05;

import com.rramirez.mod_05.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {

    @Test
    public void adicionarHappyPath(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.adicionar(10,5);
        Assert.assertEquals(15,soma);
    }

    @Test
    public void subtrairHappyPath(){
        Calculadora calculadora = new Calculadora();
        int subtrair = calculadora.subtrair(20, 15);
        Assert.assertEquals(5, subtrair);
    }

    @Test
    public void multiplicarHappyPath(){
        Calculadora calculadora = new Calculadora();
        int multiplicar = calculadora.multiplicar(5, 10);
        Assert.assertEquals(50, multiplicar);
    }

    @Test
    public void dividirHappyPath(){
        Calculadora calculadora = new Calculadora();
        int dividir = calculadora.dividir(20, 5);
        Assert.assertEquals(4, dividir);
    }

    @Test
    public void dividir(){
        Calculadora calculadora = new Calculadora();
        int dividir = calculadora.dividir(20, 0);
        Assert.assertEquals(0, dividir);
    }

}
