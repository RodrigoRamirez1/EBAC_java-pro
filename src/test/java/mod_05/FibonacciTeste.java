package mod_05;

import com.rramirez.mod_05.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTeste {

    @Test
    public void fibonacciHappyPath(){
        Fibonacci fibonacci = new Fibonacci();
        int resultado = fibonacci.findElemento(6);
        Assert.assertEquals(8, resultado);
    }

    @Test
    public void fibRetornoUm(){
        Fibonacci fibonacci = new Fibonacci();
        int resultado = fibonacci.findElemento(1);
        Assert.assertEquals(1, resultado);
    }

    @Test
    public void fibRetornoZero(){
        Fibonacci fibonacci = new Fibonacci();
        int resultado = fibonacci.findElemento(0);
        Assert.assertEquals(0, resultado);
    }

}
