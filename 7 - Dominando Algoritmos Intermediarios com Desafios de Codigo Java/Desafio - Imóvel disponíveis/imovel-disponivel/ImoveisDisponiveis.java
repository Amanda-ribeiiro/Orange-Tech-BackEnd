import java.util.Scanner;

/*
 * Desafio
O seu amigo quer verificar quais os imóveis estão disponíveis em uma certa corretora na região onde ele mora. 
A corretora disponibilizou uma API para ele, mas como ele não entende nada de programação, pediu a sua ajuda. 
Para deixar tudo bonitinho, você resolveu criar um aplicativo para seu querido amigo, mas quando foi olhar a API 
retornava os dados de uma forma esquisita, separado por barras. Ajude seu amigo deixando a informação mais amigável possível.

Entrada
A entrada será a classificação do imóvel, o valor do aluguel dele e se ele está disponível no momento.

Saída
A saída deverá ser as informações da entrada, porém de uma forma mais amigável. (sem as aspas)

Exemplo
Entrada	                          Saída
Casa/1900/Disponivel	         "Imovel: Casa R$1900 Disponivel" 
Apartamento/850/Indisponivel 	 "Imovel: Apartamento R$850 Indisponivel" 
 */




public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();  
        String[] dados = entrada.split("/");  
        String classificacao = dados[0];
        int valorAluguel = Integer.parseInt(dados[1]);
        String disponibilidade = dados[2];
        String saida = "Imovel: " + classificacao + " R$" + valorAluguel + " " + disponibilidade;
        System.out.println(saida);
    }
}
