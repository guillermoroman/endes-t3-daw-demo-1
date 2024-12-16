package com.example.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void testCadenasIguales() {
        assertTrue(StringUtils.sonIguales("Hola", "Hola"));
    }

    @Test
    public void testCadenasDiferentes(){
        assertFalse(StringUtils.sonIguales("Hola", "Adios"));
    }

    @Test
    public void testCadenasIgualesMayusculasYMinusculas(){
        assertFalse(StringUtils.sonIguales("HOLA", "hola"));
    }

    @Test
    public void testCadenaVacia(){
        assertFalse(StringUtils.sonIguales("", "Hola"));
    }

    @Test
    public void contieneMinuscula(){
        assertTrue(StringUtils.contieneLetra("Hola", 'o'));
    }

    @Test
    public void noContiene(){
        assertFalse(StringUtils.contieneLetra("Hola", 'i'));
    }

    @Test
    public void contieneMayusculaMinuscula(){
        assertTrue(StringUtils.contieneLetra("Hola", 'h'));
    }

    @Test
    public void contienePalabraVacia(){
        assertFalse(StringUtils.contieneLetra("", 'h'));
    }

}
