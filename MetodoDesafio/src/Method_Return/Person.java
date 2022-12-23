package Method_Return;

public class Person {
    public String name;
    public double weight;
    public double height;

    public double imc(){
       double calc = weight * (height * height);
       return calc;
    }

}
