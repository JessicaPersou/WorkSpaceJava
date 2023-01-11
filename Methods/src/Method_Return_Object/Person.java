package Method_Return_Object;

public class Person {
    public String name;
    public double height;
    public double weight;

    //Esse método tem como retorno o IMCRESULT
    public ImcResult calcImc(){

        ImcResult imcResult = new ImcResult();

        imcResult.height = height;
        imcResult.weight = weight;
        imcResult.result = weight / (height * height);

        return imcResult;
    }

}
