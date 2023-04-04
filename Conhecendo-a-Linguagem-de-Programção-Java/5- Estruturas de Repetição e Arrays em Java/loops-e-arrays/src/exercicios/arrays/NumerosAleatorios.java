package exercicios.arrays;
/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] NumerosAleatorios = new int[20];
        
        for(int i = 0; i < NumerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            NumerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numero: NumerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor Numeros Aleatorios: ");
        for (int numero: NumerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
        System.out.print("\nSucessores Numeros Aleatorios: ");
        for (int numero: NumerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

        
    }
    
}
