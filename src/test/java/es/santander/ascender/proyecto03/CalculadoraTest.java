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
    void testRestar() {
        long resultado = calculadora.restar(10, 5);
        assertEquals(5, resultado, "10-5 esperaba 5");
    }

}
