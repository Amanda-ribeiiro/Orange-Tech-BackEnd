/*  Crie um exemplo de classe para representar uma Smart TV onde:
1. Ela tenha características: ligada(booleana), canal(int) e volume (int);
2. Nossa TV poderá ligar e desligar assim que mudar o estado de ligada;
3. Nossa TV poderá aumentar e diminuir o volume sempre em +1 ou -1;
4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.

*/
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        // volume = volume + 1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        // volume = volume -1;
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}
