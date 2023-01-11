public class Main {
    public static void main(String[] args) {

        Tv tv = new Tv();

        //NÃO DEVERIA MUDAR VOLUME E CANAL
        tv.changeVol(20);
        tv.alterChannel(130);

        //DEVERIA MUDAR O VOLUME E CANAL
        tv.changeVol(300);
        tv.alterChannel(10);

    }
}
