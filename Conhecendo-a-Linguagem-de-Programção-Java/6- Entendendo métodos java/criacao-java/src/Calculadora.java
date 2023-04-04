/**
 * Tente ao máximo criar métodos que trabalhem sozinhos ou conjunto;
*  Pode chamar um método dentro de outro;
*  Pode passar como parâmetro, a chamada de um outro método.
 */

public class Calculadora {
    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é: " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;

        System.out.println("A subtração do " + numero1 + " menos " + numero2 + " é: " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;

        System.out.println("A multiplicação do " + numero1 + " vezes " + numero2 + "é: " + resultado );

    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;

        System.out.println("A divisão do " + numero1 + " por " + numero2 + "é: " + resultado);
    }
}
