import java.util.Date;

public class Imc {

    public double weight;
    public double height;

    People pacient;

    void pacientActive(){
        System.out.println("The pacient is active");
    }
    double calcImc(){
        return (weight*weight)/height;
    }

}
