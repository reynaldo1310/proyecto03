package es.santander.ascender.proyecto03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();
    @Test 
    public void testSumar() {
        long resultado = calculadora.sumar(5, 10);

        assertEquals(15, resultado, "10+ debería ser 15");

    }

    @Test 
    public void testRestar() {
        long resultado = calculadora.restar(10, 5);
        assertEquals(5, resultado, "10-5 esperaba 5");

    }

    @Test
    public void testMultiplicar(){
        long resultado = calculadora.multiplicar(2, 5);
        assertEquals(10, resultado, "2*5 espero que sea 10");

    }

    @Test
    public void testDividir(){
        long resultado = calculadora.dividir(10, 2);
        assertEquals(5, resultado,"10/2 espero que sea 5");
    }

    @Test 
    public void tesPresentarTablaMultiplicar() {
        Calculadora calculadora = new Calculadora();

        calculadora.presentarTablaMultiplicar(6);
    }

    @Test
    public void testCalcularTablaMultiplicar() {
        Calculadora calculadora = new Calculadora();

        calculadora.CalcularTablaMultiplicar(9);
    }
    

}
