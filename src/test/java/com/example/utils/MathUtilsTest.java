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
}
