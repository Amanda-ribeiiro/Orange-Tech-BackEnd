/*
 * 
 */
public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);


        // mensagem 
        System.out.println("Exercício Mensagem"); 
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.print("Exercício Empréstimo");
        Emprestimo.calcular(4600, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(10000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(70000, 8);

    }


    
}
