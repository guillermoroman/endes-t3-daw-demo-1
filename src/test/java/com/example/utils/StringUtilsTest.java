package com.example.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void testCadenasIguales() {
        assertTrue(StringUtils.sonIguales("Hola", "Hola"));
    }

}
