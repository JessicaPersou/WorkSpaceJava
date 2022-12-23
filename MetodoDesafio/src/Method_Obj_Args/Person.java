package Method_Obj_Args;

public class Person {
    public String name;
    public ImcResult calcImc(double height, double weight){ //São usados parâmetros ou argumentos

        ImcResult imcResult = new ImcResult();
        imcResult.result = weight / (height * height);

        return imcResult;
    }

}
