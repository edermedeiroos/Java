package lista_01.exercicio_01;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}
