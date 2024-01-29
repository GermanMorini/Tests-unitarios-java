package ger.morini;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Las pruebas se crearán bajo la misma estructura de directorios que las clases que se testean
*/

class CalculadoraTest {

      // por convención, los nombres de las pruebas debe describir los que se está probando
      @Test
      void dosMasDosEsCuatro() {
            var cal = new Calculadora();

            // assert == afirmar
            // compara el resultado del método con la salida esperadaj
            assertEquals(4, cal.sumar(2,2));
            assertNotEquals(-4, cal.sumar(2,2));
            assertTrue(4 == cal.sumar(2,2));
            assertFalse(4 != cal.sumar(2,2));
      }
}