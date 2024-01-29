package ger.morini;

public class Calculadora {

      public int sumar(int a, int b) {
            return a+b;
      }

      public float dividir(int a, int b) {
            if (b == 0) throw new ArithmeticException("No se puede dividir por cero");
            return (float) a/b;
      }
}
