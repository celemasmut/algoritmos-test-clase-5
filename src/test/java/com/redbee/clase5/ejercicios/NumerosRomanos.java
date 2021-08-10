package com.redbee.clase5.ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Escribe una función que traduzca de números romanos a decimales romanToDecimal(roman). En aras de mantener el kata
 * simple, asumamos que ya vienen validados los números.
 *
 * Los números romanos, del sistema de numeración de la antigua Roma usaba combinaciones de letras del alfabeto latino
 * para representar valores. Consta de siete símbolos:
 *
 * | Símbolo | Valor |
 * | I       | 1     |
 * | V       | 5     |
 * | X       | 10    |
 * | L       | 50    |
 * | C       | 100   |
 * | D       | 500   |
 * | M       | 1000  |
 *
 * Ejemplos:
 *
 * MMVI = 1000 + 1000 + 5 + 1 = 2006
 * MCMXLIV = 1000 + (1000 - 100) + (50 - 10) + (5 - 1) = 1944
 */
@DisplayName("Laboratorio para ejercicio de numeros romanos")
public class NumerosRomanos {
    @Test
    void calculaRomanoADecimal(){
        final var resultadoRomano = NumeroRomano.calcularRomanosSuma("MMVI");
        final var esperado = 2006;
        Assertions.assertEquals(esperado,resultadoRomano);
    }

    @Test
    void calculaSumaYRestaRomanoADecimal(){
        final var resultadoRomano = NumeroRomano.calcularCombinadoRomanos("MCMXLIV");
        final var esperado = 1944;
        Assertions.assertEquals(esperado,resultadoRomano);
    }
}
