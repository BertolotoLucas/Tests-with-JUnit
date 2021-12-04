package br.com.lucasbertoloto.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void shouldSumTwoPositiveNumbers() {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(7, 3);
        assertEquals(10,soma);
    }
}
