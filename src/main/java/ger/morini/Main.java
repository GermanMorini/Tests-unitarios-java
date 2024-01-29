package ger.morini;


/*
¿Que son los tests unitarios?

Es un tipo de prueba de software
Es aislar partes importantes de código (unidades) para probarlas y ver que funcionen como se espera que lo hagan normalmente
Una prueba unitaria aisla una parte de código y verifica que funcione correctamente

Las pruebas unitarias también son código, en donde se realizarán las pruebas de las demás piezas de código

Se deben añadir las dependencias necesarias para realizar las pruebas
*/
public class Main {
      public static void main(String[] args) {
//            System.out.println("Hola dwawawdaw");
            Calculadora cal = new Calculadora();

            System.out.printf("La suma es: %d%n", cal.sumar(2,2));
            System.out.printf("La división es: %.2f%n", cal.dividir(2,0));
      }
}
