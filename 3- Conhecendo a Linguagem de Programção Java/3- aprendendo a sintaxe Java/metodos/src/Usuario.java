public class Usuario {

    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(14);

        System.out.println("Canal Atual :" + smartTv.ligada);


        System.out.println("Tv ligada?" + smartTv.ligada);
        System.out.println("Canal atual:" + smartTv.canal);
        System.out.println("Volume atual:" + smartTv.volume);


        smartTv.ligar();
        System.out.println("Tv ligada ?" + smartTv.ligada);
    }
    
}
