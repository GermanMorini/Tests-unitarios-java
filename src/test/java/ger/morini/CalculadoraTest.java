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


      // Lo correcto es tratar de plantear varios escenarios
      @Test
      void tresMasSieteEsDiez() {
            var cal = new Calculadora();

            assertEquals(10, cal.sumar(3,7));
      }

      @Test
      void doceDivCuatro() {
            var cal = new Calculadora();

            assertEquals(3, cal.dividir(12,4));
      }

      // Cuando en los test's se arroja una excepción, estos de dicen fallidos
      // Para ello se usa la sentencia '
      @Test
      void divisionPorCero() {
            var cal = new Calculadora();

            assertThrows(ArithmeticException.class,
                    () -> cal.dividir(123,0)
            );

            assertThrows(ArithmeticException.class,
                    () -> cal.dividir(-123,0)
            );

            assertThrows(ArithmeticException.class,
                    () -> cal.dividir(0,0)
            );
      }
}