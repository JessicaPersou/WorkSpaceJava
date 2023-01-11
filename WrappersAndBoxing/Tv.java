public class Tv {
    Integer channel = 130;
    Integer vol = 20;

    void alterChannel(Integer newChannel){
        if( channel.equals(newChannel)){
            System.out.println("Novo canal é também o canal atual -> " + channel);
        }else{
            channel = newChannel;
            System.out.println("Canal alterado para: " + channel);
        }
    }

    void changeVol(Integer newVol){
        if(newVol == vol){
            System.out.println("Novo volume é também o volume atual -> " + vol);
        }else{
            vol = Integer.valueOf(newVol.byteValue());
            System.out.println("Volume alterado para: " + vol);
        }
    }
}
