package ger.morini;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
¿Que son los tests unitarios?

Es un tipo de prueba de software
Es aislar partes de código (unidades) para probarlas y ver que funcionen como se espera que lo hagan normalmente

Es un proceso de evaluación para ver que el código cumple con ciertas reglas de negocio

Se deben añadir las dependencias necesarias para realizar las pruebas (ver el pom.xml)
*/
class CalculadoraTest {

      private static Calculadora cal;

      // Ejecuta esto primero
      @BeforeAll
      public static void instanciar() {
            cal = new Calculadora();
      }

      // Este es el texto que se mostrará en la pantalla de ejecución del test
      @DisplayName("""
              Veamos que 2 + 2 = 4
              """)
      // por convención, los nombres de las pruebas deben describir lo que se está probando
      @Test
      void dosMasDosEsCuatro() {

            // assert == afirmar
            // compara el resultado del método con la salida esperadaj
            assertEquals(4, cal.sumar(2,2));
            assertNotEquals(-4, cal.sumar(2,2));
            assertTrue(4 == cal.sumar(2,2));
            assertFalse(4 != cal.sumar(2,2));
      }


      @DisplayName("""
              Veamos que 3 + 7 = 10
              """)
      // Lo correcto es tratar de plantear varios escenarios
      @Test
      void tresMasSieteEsDiez() {
            assertEquals(10, cal.sumar(3,7));
      }

      @DisplayName("""
              Veamos que 12 / 4 = 3
              """)
      @Test
      void doceDivCuatro() {
            assertEquals(3, cal.dividir(12,4));
      }

      @DisplayName("""
              Veamos que la división de un número positivo, otro neutro y otro negativo, por cero, arroja
              una excepción 'ArithmeticException'
              """)
      // Cuando en los test's se arroja una excepción, estos de dicen fallidos
      // Para ello se usa la sentencia 'assertThrows'
      @Test
      void divisionPorCero() {
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