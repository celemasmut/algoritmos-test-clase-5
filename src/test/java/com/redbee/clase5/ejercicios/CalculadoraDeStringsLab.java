package com.redbee.clase5.ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Crea una calculadora que sea capaz de recibir una operación matemática como input en un string y devuelva el
 * resultado de la misma. Para simplificar la implementación de la solución asumamos que la cadena ya está validada
 *
 * Requerimiento 1
 * Cuando el string esté vacío, deberá devolver 0. Por ejemplo, cuando se llame a calcular("") deberá devolver 0
 *
 * Requerimiento 2
 * Deberá manejar null. Si es llamado calcular(null) deberá devolver 0
 *
 * Requerimiento 3
 * Deberá manejar la posibilidad que introduzcan 1 solo valor. Por ejemplo si se llama a calcular("3"), entonces deberá
 * devolver el mismo valor, en este caso 3
 *
 * Requerimiento 4
 * Cuando se llame una operación de suma, deberá interpretarla y realizar la operación necesaria. Por ejemplo si se
 * llama a calcular("1+3") entonces deberá devolver 4
 *
 * Requerimiento 5
 * Cuando se llame a una operación de resta, deberá interpretarla y realizar la operación necesaria. Por ejemplo si se
 * llama a calcular("5-6") deberá devolver 1
 *
 */
@DisplayName("Laboratorio para ejercicio de numeros romanos")
public class CalculadoraDeStringsLab {

    /* * Requerimiento 1
     * Cuando el string esté vacío, deberá devolver 0. Por ejemplo, cuando se llame a calcular("")
     * deberá devolver 0
     **/
    @Test
    void calculaStringVacio(){

        final var stringVacio = Calculadora.calcular("");
        final var esperado = 0;
        Assertions.assertEquals(esperado,stringVacio);
    }

    /** Requerimiento 2
     * Deberá manejar null. Si es llamado calcular(null) deberá devolver 0
     **/
    @Test
    void calculaStringNull(){

        final var stringNull = Calculadora.calcular(null);
        final var esperado = 0;
        Assertions.assertEquals(esperado,stringNull);
    }

    /* * Requerimiento 3
     * Deberá manejar la posibilidad que introduzcan 1 solo valor. Por ejemplo
     * si se llama a calcular("3"), entonces deberá
     * devolver el mismo valor, en este caso 3*/

    @Test
    void calculaStringUnSoloValor(){

        final var stringValorSolo = Calculadora.calcular("5");
        final var esperado = 5;
        Assertions.assertEquals(esperado,stringValorSolo);
    }

    /* * Requerimiento 4
     * Cuando se llame una operación de suma, deberá interpretarla y
     * realizar la operación necesaria. Por ejemplo si se
     * llama a calcular("1+3") entonces deberá devolver 4*/

    @Test
    void calculaStringSuma(){

        final var stringSuma = Calculadora.calcular("5+2");
        final var esperado = 7;
        Assertions.assertEquals(esperado,stringSuma);
    }

    /** Requerimiento 5
     * Cuando se llame a una operación de resta, deberá interpretarla y realizar la operación necesaria.
     * Por ejemplo si se
     * llama a calcular("5-6") deberá devolver 1
     **/

    @Test
    void calculaStringresta(){

        final var stringResta = Calculadora.calcular("5-2");
        final var esperado = 3;
        Assertions.assertEquals(esperado,stringResta);
    }
}
