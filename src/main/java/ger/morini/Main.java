package ger.morini;

public class Main {
      public static void main(String[] args) {
//            System.out.println("Hola dwawawdaw");
            Calculadora cal = new Calculadora();

            System.out.printf("La suma es: %d%n", cal.sumar(2,2));
            System.out.printf("La división es: %.2f%n", cal.dividir(2,0));
      }
}
