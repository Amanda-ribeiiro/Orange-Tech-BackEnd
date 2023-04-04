package exercicios.loops;

import java.util.Scanner;   

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
ctrl + d = duplicar a linha
ctrl + shift + f10 = roda o programa
ctrl + shift + seta pra cima = selecionar o teste e apertar essas teclas, arrasta o codigo pra cima
*/
public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");
    }
}
