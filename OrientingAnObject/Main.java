public class Main {
    public static void main(String[] args) {
        Imc exameJessica = new Imc();
        exameJessica.pacient = new People();
        exameJessica.height= 1.65;
        exameJessica.weight = 67.8;


        System.out.println(exameJessica.calcImc());
    }
}
