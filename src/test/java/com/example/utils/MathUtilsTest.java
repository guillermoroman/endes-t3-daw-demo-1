package com.example.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void maxWithPositiveNumbers(){
        int x = 8;
        int y = 15;

        int esperado = 15;
        int resultado = MathUtils.max(x, y);

        assertEquals(esperado, resultado);
    }

    @Test
    public void maxWithNegativeNumbers(){
         assertEquals(-8, MathUtils.max(-8, -15));
    }

    @Test
    public void maxWithMixedNumbers(){
        assertEquals(7, MathUtils.max(-8, 7));
    }

    @Test
    public void maxWithZero(){
        assertEquals(0 , MathUtils.max(0, -4));
    }

    @Test
    public void esParPositivo(){
        assertTrue(MathUtils.esPar(4));
    }

    @Test
    public void esImparPositivo(){
        assertFalse(MathUtils.esPar(5));
    }

    @Test
    public void esParNegativo(){
        assertTrue(MathUtils.esPar(-4000));
    }

    @Test
    public void esParCero(){
        assertTrue(MathUtils.esPar(0));
    }



}
